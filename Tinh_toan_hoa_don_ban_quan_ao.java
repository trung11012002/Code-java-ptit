/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SanPham{
    private String ma , ten;
    private int giaLoai1 , giaLoai2;

    public SanPham(String ma, String ten, int giaLoai1, int giaLoai2) {
        this.ma = ma;
        this.ten = ten;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public int getGiaLoai1() {
        return giaLoai1;
    }

    public int getGiaLoai2() {
        return giaLoai2;
    }

    public String getTen() {
        return ten;
    }
    
}
class HoaDon implements Comparable<HoaDon>{
    private String id;
    private String maHoaDon ;
    private int soLuong;
    private SanPham tmp;
    private static int cnt =1;
    public HoaDon(String maHoaDon, int soLuong, SanPham tmp) {
        this.id = String.format("%03d", cnt++);
        this.maHoaDon = maHoaDon;
        this.soLuong = soLuong;
        this.tmp = tmp;
    }
    private int Loai(){
        String s = maHoaDon.charAt(maHoaDon.length()-1) +"";
        int z = Integer.parseInt(s);
        return z;   
    }
    private int thanhTien(){
        if(Loai() == 1){
            return soLuong*tmp.getGiaLoai1();
        }
        else return soLuong*tmp.getGiaLoai2();
    }
    private float giamGia(){
        if (soLuong >= 150) {
            return (float)thanhTien()*50/100;
        }
        else if (soLuong >= 100) {
            return (float)thanhTien()*30/100;
        }
        else if(soLuong >= 50){
            return (float)thanhTien()*15/100;
        }
        else return 0;
    }
    private float soTienPhaiTra(){
        return (float)thanhTien()-giamGia();
    }

    @Override
    public String toString() {
        return maHoaDon +"-"+id +" "+tmp.getTen() +" " +
                String.format("%.0f",giamGia()) +" "+
                String.format("%.0f", soTienPhaiTra());
    }
    @Override
    public int compareTo(HoaDon o){
        if(this.soTienPhaiTra() < o.soTienPhaiTra()){
            return 1;
        }
        return -1;
    }
}
public class Tinh_toan_hoa_don_ban_quan_ao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =Integer.parseInt(sc.nextLine());
        Map<String , SanPham> map = new HashMap<>();
        for (int i=0;i<n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            SanPham sv = new SanPham(ma,ten,a,b);
            map.put(ma,sv);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> ds = new ArrayList<>();
        for(int i=0;i<m;i++){
            String ma = sc.next();
            int soLuong  = sc.nextInt();
            String s = ma.substring(0,2);
            HoaDon sv = new HoaDon(ma,soLuong,map.get(s));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(HoaDon x : ds){
            System.out.println(x);
        }
    }
}
