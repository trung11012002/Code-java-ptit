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
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class ThiSinh implements  Comparable<ThiSinh>{
    private String ma;
    private String ten;
    private float diem;
    private String dan_toc;
    private int khuVuc;
    private static int cnt =1;
    public ThiSinh(String ten, float diem, String dan_toc, int khuVuc) {
        this.ma = String.format("TS%02d", cnt++);
        this.ten = ten;
        this.diem = diem;
        this.dan_toc = dan_toc;
        this.khuVuc = khuVuc;
    }
    private String chuan_hoa_ho_ten(){
        String s = this.ten.toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        String z="";
        ArrayList<String> nn = new ArrayList<String>();
        while(st.hasMoreTokens()){
            String zz = st.nextToken();
            zz = zz.substring(0,1).toUpperCase() + zz.substring(1);
            nn.add(zz);
        }
        z = nn.get(0);
        for(int i=1;i<nn.size();i++){
            z = z + " " + nn.get(i);
        }
        return z;
    }
    private float diemUuTienKhuVuc(){
        if(this.khuVuc == 1) return (float) 1.5;
        else if(this.khuVuc == 2) return 1;
        else  return 0;      
    }
    private float diemUuTienDanToc(){
        if(this.dan_toc.compareTo("Kinh") == 0) return 0;
        else return (float) 1.5;
    }
    private float tongDiem(){
        return this.diem + diemUuTienDanToc() +diemUuTienKhuVuc() ;
    }
//    private String chuan_hoa_diem_tb(){
//       String s = String.format("%.1f", this.tongDiem());
//       if(s.charAt(s.length() - 1) == '0'&& s.charAt(s.length() - 2) == '.'){
//           s=s.substring(0,s.length()-2);
//       }
//       return s;
//   }
    @Override
    public String toString() {
        if(this.tongDiem() >= 20.5){
            return  ma + " " + chuan_hoa_ho_ten()+ " " + String.format("%.1f", this.tongDiem())+" Do";
        }
        else {
            return  ma + " " +chuan_hoa_ho_ten() + " " + String.format("%.1f", this.tongDiem()) +" Truot";
        }
    }
    @Override
    public int compareTo(ThiSinh o){
        if(this.tongDiem() < o.tongDiem()){
            return 1;
        }
        if(this.tongDiem() == o.tongDiem() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Diem_tuyen_sinh {
    public static void main(String[] args) throws FileNotFoundException {
         //Scanner sc = new Scanner(System.in);
         Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            ThiSinh sv = new ThiSinh(sc.nextLine(),Float.parseFloat(sc.nextLine()),
            sc.nextLine() , Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(ThiSinh xxx : ds){
            System.out.println(xxx);
        }
    }
}
