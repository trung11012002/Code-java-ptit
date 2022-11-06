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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class KhachHang{
    private String ma , ten, sex ;
    private Date date;
    private String address;
    private static int cnt =1;

    public KhachHang(String ten, String sex, String date, String address) throws ParseException {
        this.ma = String.format("KH%03d" , cnt++);
        this.ten = ten;
        this.sex = sex;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.address = address;
    }
     public String getMa() {
        return ma;
    }    

    public String getTen() {
        return ten;
    }

    public String getAddress() {
        return address;
    }
     
}
class MatHang{
    private String maMH , tenMH , donVi ;
    private long giaMua ,giaBan;
    private static int cnt =1;
    public MatHang( String tenMH, String donVi, long giaMua, long giaBan) {
        this.maMH = String.format("MH%03d",cnt++);
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonVi() {
        return donVi;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
    
}
class HoaDon implements Comparable<HoaDon>{
    private String maHoaDon;
    private String ma1 , ma2 ;
    private long soLuong;
    private KhachHang tmp1;
    private MatHang tmp2;
    private static int cnt =1;
    public HoaDon(String ma1, String ma2, long soLuong, KhachHang tmp1, MatHang tmp2) {
        this.maHoaDon = String.format("HD%03d", cnt++);
        this.ma1 = ma1;
        this.ma2 = ma2;
        this.soLuong = soLuong;
        this.tmp1 = tmp1;
        this.tmp2 = tmp2;
    }
    private long thanhTien(){
        return tmp2.getGiaBan()*soLuong;
    }
    private long loiNhuan(){
        return (tmp2.getGiaBan()-tmp2.getGiaMua())*soLuong;
    }
    @Override
    public String toString() {
        return  maHoaDon + " " + tmp1.getTen() +" "+tmp1.getAddress() +" "+
               tmp2.getTenMH()+ " "+ soLuong +" "+thanhTien() +" "+loiNhuan();
    }
    @Override
    public int compareTo(HoaDon o){
        if(this.loiNhuan() < o.loiNhuan()) {
            return 1;
        }
        if(this.loiNhuan() == o.loiNhuan() && this.maHoaDon.compareTo(o.maHoaDon) > 0) {
            return 1;
        }
        return -1;
    }
}
public class Quan_li_ban_hang_1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String , KhachHang> map1 = new LinkedHashMap<String,KhachHang>();
        for(int i=0;i<n;i++){
            KhachHang sv = new KhachHang(sc.nextLine(),sc.nextLine(),sc.nextLine(),
            sc.nextLine());
            map1.put(sv.getMa() , sv);
        }
        int m = Integer.parseInt(sc.nextLine());
        Map<String ,MatHang> map2 = new LinkedHashMap<String,MatHang>();
        for(int i=0;i<m;i++){
            MatHang sv = new MatHang(sc.nextLine(),sc.nextLine(),
            Long.parseLong(sc.nextLine()) ,Long.parseLong(sc.nextLine()));
            map2.put(sv.getMaMH(),sv);
        }
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> ds = new ArrayList<HoaDon>();
        for(int i=0;i<q;i++){
            String ma1 = sc.next();
            String ma2 = sc.next();
            HoaDon sv = new HoaDon(ma1 , ma2 ,sc.nextLong(),
            map1.get(ma1) , map2.get(ma2));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(HoaDon xxx : ds){
            System.out.println(xxx);
        }
    }
}
