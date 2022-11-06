/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.text.ParseException;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author admin
 */
class NhanVien implements Comparable<NhanVien>{
    private String ma;
    private String hoTen;
    private String chucVu;
    private int luongCoBan;
    private int soNgayCong;
    private static int cnt = 1;
    public NhanVien(String hoTen, String chucVu, int luongCoBan, int soNgayCong) throws  ParseException{
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.ma = String.format("NV%02d", cnt++);
    }
    public int phuCapChucVu(){
        if(this.chucVu.compareTo("GD") == 0){
            return 500;
        }
        else if(this.chucVu.compareTo("PGD") == 0){
            return 400;
        }
        else if(this.chucVu.compareTo("TP") == 0){
            return 300;
        }
        else if(this.chucVu.compareTo("KT") == 0){
            return 250;
        }
        else return 100;
    }
    public int luongChinh(){
        return this.luongCoBan*this.soNgayCong;
    }
    public int tamUng(){
        float tmp = (float)(this.phuCapChucVu()+this.luongChinh() * 2)/3;
        int k =  Math.round( tmp / 1000) * 1000;
        if(k < 25000){
            return k;
        }
        else return 25000;
    }
    public int conLai(){
        return this.luongChinh() - this.tamUng() + this.phuCapChucVu();
    }
    public int thunhap(){
        return phuCapChucVu() + luongChinh();
    }
    @Override
    public String toString() {
        return  ma + " " + hoTen + " " + this.phuCapChucVu() +" "+this.luongChinh() +" "+this.tamUng() +" "+this.conLai();
    }
    @Override 
    public int compareTo(NhanVien o){
        if(this.thunhap() < o.thunhap()){
            return 1;
        }
        if(this.thunhap() == o.thunhap() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Tinh_thu_nhap_cho_nhan_vien {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            NhanVien sv = new NhanVien(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(NhanVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
