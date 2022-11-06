/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,soPhong;
    private Date ngayNhanPhong;
    private Date ngayTraPhong;
    private int phatSinh;
    private static int cnt =1;
    public KhachHang(String ten, String soPhong, String ngayNhanPhong, String ngayTraPhong, int phatSinh) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhanPhong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhanPhong);
        this.ngayTraPhong =  new SimpleDateFormat("dd/MM/yyyy").parse(ngayTraPhong);
        this.phatSinh = phatSinh;
    }
    private int donGia(){
        if(this.soPhong.charAt(0) == '1') return 25;
        else if(this.soPhong.charAt(0) == '2') return 34;
        else if(this.soPhong.charAt(0) == '3') return 50;
        else return 80;
    }
    private long soNgay(){
        long tmp = Math.abs(this.ngayTraPhong.getTime()-this.ngayNhanPhong.getTime());
        tmp/=1000;
        tmp = tmp/(24*60*60);
        return (tmp+1);
    }
    private long tongTien(){
        return this.soNgay()*this.donGia()+this.phatSinh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong +" "+soNgay() +" "+tongTien();
    }
    @Override
    public int compareTo(KhachHang o){
        if(this.tongTien()<o.tongTien()){
            return 1;
        }
        return -1;
    }
}
public class Hoa_don_khach_san {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        for(int i=0;i<n;i++){
            KhachHang sv = new KhachHang(sc.nextLine() , sc.nextLine() ,sc.nextLine(),
            sc.nextLine() , Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(KhachHang xxx : ds){
            System.out.println(xxx);
        }
    }
}
