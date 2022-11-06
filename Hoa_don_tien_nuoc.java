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
class HoaDon implements Comparable<HoaDon>{
    private String ma,ten;
    private int chiSoCu;
    private int chiSoMoi;
    private static int cnt=1;
    public HoaDon(String ten, int chiSoCu, int chiSoMoi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    private int soSuDung(){
        return this.chiSoMoi-this.chiSoCu;
    }
    private int phuPhi(){
        if(soSuDung()>=100) return 5;
        else if(soSuDung() >= 51) return 3;
        else return 2;
    }
    private float tongTien(){
       float tmp=(float)soSuDung();
       float cnt =0;
       if(tmp > 100){
           cnt = 50*100 + 50*150 + (tmp-100)*200;
       }
       else if(tmp > 50){
           cnt = 50*100 + (tmp-50)*150;
       }
       else cnt = tmp*100;
       cnt = cnt + cnt *phuPhi()/100;
       return cnt;
    }
    @Override
    public String toString() {
        return  ma + " " + ten +" "+ String.format("%.0f", tongTien());
    }
    @Override
    public int compareTo(HoaDon o){
        if(this.tongTien()<o.tongTien()){
            return 1;
        }
        return -1;
    }
}
public class Hoa_don_tien_nuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> ds = new ArrayList<HoaDon>();
        for(int i =0;i<n;i++){
            HoaDon sv = new HoaDon(sc.nextLine(),Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(HoaDon xxx : ds){
            System.out.println(xxx);
        }
    }
}
