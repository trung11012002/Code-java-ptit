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
class Hang implements Comparable<Hang>{
    private String ma;
    private long soLuongNhap;
    public Hang(String ma, long soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
    }

    public String getMa() {
        return ma;
    }
    
    private int soLuongXuat(){
        float tmp;
        char z = this.ma.charAt(0);
        if(z == 'A') tmp=(float)soLuongNhap*60/100;
        else tmp=(float)soLuongNhap*70/100;
        return Math.round(tmp);
    }
    private int donGia(){
        char z = this.ma.charAt(this.ma.length()-1);
        if(z == 'Y') return 110000;
        else return 135000;
    }
    private long tien(){
        return (long)soLuongXuat()*donGia();
        
    }
    private double thue(){
        char s = this.ma.charAt(0);
        char z = this.ma.charAt(this.ma.length()-1);
        if(s == 'A' && z == 'Y') return (double)tien()*8/100;
        if(s == 'A' && z == 'N') return (double)tien()*11/100;
        if(s=='B' && z =='Y') return (double)tien()*17/100;
        if(s=='B' && z == 'N') return (double)tien()*22/100;
        return 0;
    }

    @Override
    public String toString() {
        return  ma + " " + soLuongNhap + " " +soLuongXuat()+" "+donGia()+" "+tien()+" "+String.format("%.0f", thue());
    }
     @Override
    public int compareTo(Hang o){
        if(this.thue() < o.thue()){
            return 1;
        }
        return -1;
    }
}
public class Bang_theo_doi_nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds = new ArrayList<Hang>();
        for(int i=0;i<n;i++){
            Hang sv = new Hang(sc.nextLine() ,Long.parseLong(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        String tmp = sc.next();
        for(Hang xxx : ds){
            if((xxx.getMa().charAt(0)+"").compareTo(tmp)==0){
                System.out.println(xxx);
            }
                
        }
    }
}
