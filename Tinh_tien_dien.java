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
class TienDien implements Comparable<TienDien>{
    private String ma,loaiSD;
    private long soCu;
    private long soMoi;
    private static int cnt = 1;
    public TienDien( String loaiSD, long soCu, long soMoi) {
        this.ma = String.format("KH%02d", cnt++);
        this.loaiSD = loaiSD;
        this.soCu = soCu;
        this.soMoi = soMoi;
    }
    private long heSo(){
        if(this.loaiSD.compareTo("KD") == 0) return 3;
        else if(this.loaiSD.compareTo("NN") == 0) return 5;
        else if(this.loaiSD.compareTo("TT") == 0) return 4;
        else return 2;
    }
    private long thanhTien(){
        return (long)(this.soMoi-soCu)*heSo()*550;
    }
    private double phuTroi(){
        long tmp = this.soMoi-this.soCu;
        if(tmp < 50) return 0.0;
        if(tmp <=100 && tmp >= 50) return thanhTien()/100.0*35;
        if(tmp >100) return thanhTien()/100.0*100;
        return 0;
    }
    private double tongTien(){
        return  (double)(thanhTien()+ phuTroi());
    }
    @Override
    public String toString() {
        return  ma + " " + heSo() + " " + thanhTien() +" "+
                String.format("%.0f", phuTroi()) +" "+String.format("%.0f", tongTien());
    }
    @Override
    public int compareTo(TienDien o){
        if(this.tongTien() < o.tongTien()){
            return 1;
        }
        return -1;
    }
}
public class Tinh_tien_dien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TienDien> ds = new ArrayList<TienDien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            TienDien sv = new TienDien(sc.nextLine(),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(TienDien xxx : ds){
            System.out.println(xxx);
        }
    }
}