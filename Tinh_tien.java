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
class TinhTien implements Comparable<TinhTien>{
    private String ma,ten;
    private long soLuongMua;
    private long donGia;
    private long tienChietKhau;
    public TinhTien(String ma, String ten, long soLuongMua, long donGia, long tienChietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
    }
    private long tongTien(){
        return this.soLuongMua*this.donGia - this.tienChietKhau;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + soLuongMua + " " + donGia + " " + tienChietKhau + " "+tongTien();
    }
    @Override
    public int compareTo(TinhTien o){
        if(this.tongTien() < o.tongTien()){
            return 1;
        }
        return -1;
    }
}
public class Tinh_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TinhTien> ds = new ArrayList<TinhTien>();
        for(int i=0;i<n;i++){
            TinhTien sv = new TinhTien(sc.nextLine(),sc.nextLine() ,
            Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(TinhTien xxx : ds){
            System.out.println(xxx);
        }
    }
}
