/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MonHoc implements Comparable<MonHoc>{
    private String ma,ten,soTC,hinhThuc,hinhThucTh;

    public MonHoc(String ma, String ten, String soTC, String hinhThuc, String hinhThucTh) {
        this.ma = ma;
        this.ten = ten;
        this.soTC = soTC;
        this.hinhThuc = hinhThuc;
        this.hinhThucTh = hinhThucTh;
    }

    public String getHinhThucTh() {
        return hinhThucTh;
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + soTC + " " + hinhThuc + " " + hinhThucTh ;
    }
    @Override
    public int compareTo(MonHoc o){
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return -1;
    }
}
public class Dang_ki_hinh_thuc_giang_day {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<MonHoc>();
        for(int i=0;i<n;i++){
            MonHoc sv = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),
            sc.nextLine(),sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(MonHoc x : ds){
            if(!x.getHinhThucTh().equals("Truc tiep")){
                System.out.println(x);
            }
        }
    } 
}
