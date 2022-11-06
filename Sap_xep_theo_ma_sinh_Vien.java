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
class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + email ;
    }
    @Override
    public int compareTo(SinhVien o){
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Sap_xep_theo_ma_sinh_Vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        while(sc.hasNext()){
           SinhVien sv = new SinhVien(sc.nextLine() , sc.nextLine() ,sc.nextLine() ,sc.nextLine());
           ds.add(sv);
        }     
        Collections.sort(ds);
        for(SinhVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
