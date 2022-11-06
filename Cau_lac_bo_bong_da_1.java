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
class CLB{
    private String ma;
    private String ten;
    private int gia_ve;
    
    public CLB(String ma, String ten, int gia_ve) {
        this.ma = ma;
        this.ten = ten;
        this.gia_ve = gia_ve;
    }

    public String getMa() {
        return ma;
    }

    public int getGia_ve() {
        return gia_ve;
    }

    public String getTen() {
        return ten;
    }
}
class TranDau implements Comparable<TranDau>{
    private String MaTranDau;
    private int so_luong;
    private CLB club;
    public TranDau(String MaTranDau, int so_luong ,CLB club) {
        this.MaTranDau = MaTranDau;
        this.so_luong = so_luong;
        this.club = club;
    }
    private int doanhThu(){
        return this.so_luong * this.club.getGia_ve();
    }

    @Override
    public String toString() {
        return  MaTranDau + " " + club.getTen() + " " + doanhThu();
    }
    @Override
    public int compareTo(TranDau o){
        if(this.doanhThu() < o.doanhThu()){
            return 1;
        }
        if(this.doanhThu() == o.doanhThu() && this.club.getTen().compareTo(o.club.getTen()) > 0){
            return 1;
        }
        return -1;
    }
}
public class Cau_lac_bo_bong_da_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, CLB> ds1 =  new HashMap<String ,CLB>();
        ArrayList <TranDau> ds2 = new ArrayList<TranDau>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            CLB sv = new CLB(sc.nextLine(),sc.nextLine() , Integer.parseInt(sc.nextLine()));
            ds1.put(sv.getMa() , sv);
        }
        int m = Integer.parseInt(sc.nextLine());     
        for(int j=0;j<m;j++){
            String z = sc.next();
            TranDau ssv = new TranDau(z , sc.nextInt() , ds1.get(z.substring(1, 3)));
            ds2.add(ssv);
        }
        Collections.sort(ds2);
        for(TranDau xxx : ds2){
            System.out.println(xxx);
        }
    }
}
