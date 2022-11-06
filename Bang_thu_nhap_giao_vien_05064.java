/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class GiaoVien{
    private String ma,ten;
    private long luongCoBan;

    public GiaoVien(String ma, String ten, long luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    private int bacLuong(){
        String s = this.ma.substring(2);
        int tmp = 0;
        for( int i =0;i<s.length();i++){
            tmp = tmp *10 + (s.charAt(i)-'0');
        }
        return tmp;
    }
    private long phuCap(){
        String s = this.ma.substring(0,2);
        if(s.equals("HT")) return 2000000;
        else if(s.equals("HP")) return 900000;
        else return 500000;
    }
    private long thuNhap(){
        return luongCoBan*bacLuong() + phuCap();
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + bacLuong() +" "+phuCap()+" "+thuNhap();
    }
    
}
public class Bang_thu_nhap_giao_vien_05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ds = new ArrayList<GiaoVien>();
        Map<String , Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luong = sc.nextLong();
            sc.nextLine();
            String z = ma.substring(0,2);
            if(z.equals("HT")){
                if(map.containsKey(z)){
                    continue;
                }
                else {
                    map.put(z , 1);
                }
            }
            if(z.equals("HP")){
                if(map.containsKey(z)){
                    if(map.get(z) == 2){
                        continue;
                    }
                    else{
                        map.put(z, map.get(z) + 1);
                    }
                }
                else map.put(z, 1);
            }
            GiaoVien sv = new GiaoVien(ma , ten , luong);
            ds.add(sv);
        }
        for(GiaoVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
