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
class TuyenDung implements Comparable<TuyenDung>{
    private String ma;
    private String ten;
    private float lyThuyet;
    private float thucHanh;
    private static int cnt=1;
    public TuyenDung(String ten, float lyThuyet, float thucHanh) {
        this.ma = String.format("TS%02d", cnt++);
        this.ten = ten;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }
    private float diemTb(){
        return (this.lyThuyet + this.thucHanh)/2;
    }
    private String xepLoai(){
       if(diemTb() > 9.5) return "XUAT SAC";
       else if(diemTb() >= 8) return "DAT";
       else if(diemTb() > 5 && diemTb() < 8) return "CAN NHAC";
       else return "TRUOT";
    }

    @Override
    public String toString() {
        return ma + " " + ten +" "+String.format("%.2f",diemTb())+" "+xepLoai();
    }
    @Override
    public int compareTo(TuyenDung o){
        if(this.diemTb() < o.diemTb()){
            return 1;
        }
        return -1;
    }
}
public class Tuyen_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenDung> ds = new ArrayList<TuyenDung>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.length()  == 2){
                if(a.compareTo("10") != 0){
                    a = a.charAt(0) + "." + a.charAt(1);
                }
            }
            if(b.length() == 2){
                if(b.compareTo("10") != 0){
                    b = b.charAt(0) + "." + b.charAt(1);
                }
            }
            TuyenDung sv = new TuyenDung(s ,Float.valueOf(a) ,Float.valueOf(b));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(TuyenDung xxx : ds){
            System.out.println(xxx);
        }
    }
}
