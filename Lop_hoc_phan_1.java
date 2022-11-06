/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class HocPhan implements Comparable<HocPhan>{
    private String ma;
    private String ten_mon_hoc;
    private String nhom;
    private String ten_giang_vien;

    public HocPhan(String ma, String ten_mon_hoc, String nhom, String ten_giang_vien) {
        this.ma = ma;
        this.ten_mon_hoc = ten_mon_hoc;
        this.nhom = nhom;
        this.ten_giang_vien = ten_giang_vien;
    }

    public String getMa() {
        return ma;
    }
    
    public String getTen_mon_hoc() {
        return ten_mon_hoc;
    }

    @Override
    public String toString() {
        return  nhom +" "+ ten_giang_vien ;
    }
    @Override
    public int compareTo(HocPhan o){
        if(this.nhom.compareTo(o.nhom) > 0){
            return 1;
        }
         if(this.nhom.compareTo(o.nhom) == 0 && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Lop_hoc_phan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map <String ,String> map = new HashMap<String ,String>();
        ArrayList<HocPhan> ds = new ArrayList<HocPhan>();
        for(int i=0;i<n;i++){
            HocPhan sv =  new HocPhan(sc.nextLine() ,sc.nextLine()
            , sc.nextLine() , sc.nextLine());
            map.put(sv.getMa(),sv.getTen_mon_hoc());
            ds.add(sv);
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());
         while(m-->0){
            String check = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + map.get(check) + ":");
            for(HocPhan x : ds){
                if(x.getMa().equals(check)){
                    System.out.println(x);
                }
            }
        }
     }
}
