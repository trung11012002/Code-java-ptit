/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.math.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.*;
/**
 *
 * @author admin
 */
class Bang_diem implements Comparable<Bang_diem>{
   private String ma;
   private String ten;
   private float x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
   private static int cnt =1;
    public Bang_diem( String ten, float x1, float x2, float x3, float x4, float x5, float x6, float x7, float x8, float x9, float x10) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.x7 = x7;
        this.x8 = x8;
        this.x9 = x9;
        this.x10 = x10;
    }
   private float diem_tb(){
       float sum = (float)(this.x1*2 +this.x2*2+this.x3+this.x4+this.x5+this.x6+this.x7+this.x8+this.x9+this.x10);
       sum = (float)sum/12;
       sum = (float) (Math.round(sum*10.0) / 10.0);
       return sum;
   }
//   private String chuan_hoa_diem_tb(){
//       String s = this.diem_tb() +"";
//       if(s.charAt(s.length() - 1) == '0' && s.charAt(s.length()-2) == '.'){
//           s=s.substring(0,s.length()-2);
//       }
//       return s;
//   }
   private String xep_hang(){
       float z = this.diem_tb();
       System.out.println(z);
       if(z >= 9){
           return "XUAT SAC";
       }
       if(z >= 8 && z <= 8.9){
           return "GIOI";
       }
       if(z >= 7 && z <= 7.9){
           return "KHA";
       }
       if(z >= 5 && z <= 6.9){
           return "TB";
       }
       else return "YEU";
   }
    @Override
    public String toString() {
        return  ma + " "+ ten + " " + String.format("%.1f",this.diem_tb()) +" " +xep_hang();
    }
   @Override
   public int compareTo(Bang_diem o){
       float a = (float) (Math.round(this.diem_tb()*10.0) / 10.0);
       float b = (float) (Math.round(o.diem_tb()*10.0) / 10.0);
       if(a < b){
           return 1;
       }
       if(a==b && this.ma.compareTo(o.ma) > 0){
           return 1;
       }
       return -1;
   }
}
public class Bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList <Bang_diem> ds = new ArrayList<Bang_diem>();
        for(int i=0;i<n;i++){
            Bang_diem sv = new Bang_diem(sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),
            sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
            sc.nextLine();
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Bang_diem xxx : ds){
            System.out.println(xxx);
        }
    }
}
