/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class GiaoVien implements Comparable<GiaoVien>{
    private String ma;
    private String ten;
    private String maXetTuyen;
    private float a;
    private float b;
    private static int cnt =1;
    public GiaoVien(String ten, String maXetTuyen, float a, float b) {
        this.ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.maXetTuyen = maXetTuyen;
        this.a = a;
        this.b = b;
    }
    private String mon(){
        if(this.maXetTuyen.charAt(0) == 'A') return "TOAN";
        else if(this.maXetTuyen.charAt(0) == 'B') return "LY";
        else return "HOA";
    }
    private float diemUuTien(){
        char z = this.maXetTuyen.charAt(1);
        if(z == '1') return (float) 2.0;
        else if(z == '2') return (float) 1.5;
        else if(z == '3') return (float) 1.0;
        else return (float) 0.0;
    }
    private float tongDiem(){
        return (this.a*2 + this.b + this.diemUuTien());
    }
    private String ketqua(){
        if(this.tongDiem() >= 18) return "TRUNG TUYEN";
        else return "LOAI";
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " +" " + mon() + " " +String.format("%.1f", tongDiem()) +" " +ketqua();
    }
    @Override
    public int compareTo(GiaoVien o){
        if(this.tongDiem() < o.tongDiem()){
            return 1;
        }
        if(this.tongDiem() == o.tongDiem() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Tuyen_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoVien> ds = new ArrayList<GiaoVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            GiaoVien sv = new GiaoVien(sc.nextLine() , sc.nextLine() ,
            Float.parseFloat(sc.nextLine() ) , Float.parseFloat(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(GiaoVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
