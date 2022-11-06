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
class SanPham implements Comparable<SanPham>{
    private String ma;
    private String ten;
    private int gia_ban;
    private int bh;

    public SanPham(String ma, String ten, int gia_ban, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia_ban = gia_ban;
        this.bh = bh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia_ban + " " + bh ;
    }
    @Override
    public int compareTo(SanPham o){
        if(this.gia_ban < o.gia_ban){
            return 1;
        }
        if(this.gia_ban == o.gia_ban && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_Sach_San_pham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SANPHAM.in");
        Scanner sc = new Scanner(file);
        ArrayList <SanPham> ds = new ArrayList<SanPham>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            SanPham sv = new SanPham(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(SanPham xxx : ds){
            System.out.println(xxx);
        }
    }
}
