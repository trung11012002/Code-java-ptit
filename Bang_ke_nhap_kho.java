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
class NhapKho implements Comparable<NhapKho>{
    private String ma,ten;
    private int soLuong,donGia;
    private static Map<String,Integer> map = new HashMap<String,Integer>();

    public NhapKho(String ten, int soLuong, int donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String [] arr = this.ten.split(" ");
        String s =arr[0].substring(0,1).toUpperCase() + arr[1].substring(0,1).toUpperCase()+"";
        if(!map.containsKey(s)){
            map.put(s, 1);
            this.ma = String.format(s + "%02d", 1);
        }
        else{
            map.put(s, map.get(s) +1);
            this.ma = String.format(s + "%02d", map.get(s));
        }
    }
    private float phanTram(){
        if(soLuong > 10) return (float)5/100;
        else if (soLuong >= 8) return (float)2/100;
        else if(soLuong >= 5) return (float)1/100;
        else return 0;
    }
    private float tienChietKhau(){
        return (float)donGia*soLuong*phanTram();
    }
    private float thanhTien(){
        return (float)donGia*soLuong-tienChietKhau();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " "+String.format("%.0f",tienChietKhau()) +" "+String.format("%.0f", thanhTien());
        
    }
     @Override
    public int compareTo(NhapKho o){
        if(this.tienChietKhau()<o.tienChietKhau()){
            return 1;
        }
        return -1;
    }
}
public class Bang_ke_nhap_kho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhapKho>  ds = new ArrayList<NhapKho>();
        for(int i=0;i<n;i++){
            NhapKho sv = new NhapKho(sc.nextLine(),Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(NhapKho xxx : ds){
            System.out.println(xxx);
        }
    }
}
