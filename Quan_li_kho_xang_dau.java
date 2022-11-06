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
class KhoDau implements Comparable<KhoDau>{
    private String ma;
    private int soLuong;
    public KhoDau(String ma, int soLuong) {
        this.ma = ma;
        this.soLuong = soLuong;
    }
    private String hangSanXuat(){
        String s = this.ma.substring(3);
        if(s.compareTo("BP") == 0) return "British Petro";
        else if(s.compareTo("ES") == 0) return "Esso";
        else if(s.compareTo("SH") == 0) return "Shell";
        else if(s.compareTo("CA") == 0) return "Castrol";
        else if(s.compareTo("MO") == 0) return "Mobil";
        else return "Trong Nuoc";
    }
    private int donGia(){
        char z = this.ma.charAt(0);
        if(z == 'X') return 128000;
        else if(z == 'D') return 11200;
        else return 9700;
    }
    private double thue(){
        String s = this.ma.substring(3);
        char z = this.ma.charAt(0);
        if(s.compareTo("TN") == 0) return 0;
        else {
            if(z == 'X') return (double)donGia()*soLuong*3/100;
            else if(z == 'D') return (double)donGia()*soLuong*3.5/100;
            else return (double)donGia()*soLuong*2/100;
        }
    }
    private double thanhTien(){
        return (double)soLuong*donGia()+thue();
    }
    @Override
    public String toString() {
        return  ma + " "+hangSanXuat() +" "+donGia()+" "+String.format("%.0f", thue())+" "+String.format("%.0f", thanhTien());
    }
    @Override
    public int compareTo(KhoDau o){
        if(this.thanhTien()<o.thanhTien()){
            return 1;
        }
        return -1;
    }
}
public class Quan_li_kho_xang_dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhoDau> ds = new ArrayList<KhoDau>();
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            KhoDau sv = new KhoDau(sc.next() , sc.nextInt());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(KhoDau xxx : ds){
            System.out.println(xxx);
        }
    }
}
