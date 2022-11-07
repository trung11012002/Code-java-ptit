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
   private double x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
   private static int cnt =1;

    public Bang_diem(String ten, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double x9, double x10) {
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
   
   private double diem_tb(){
       double sum = (double)(this.x1*2 +this.x2*2+this.x3+this.x4+this.x5+this.x6+this.x7+this.x8+this.x9+this.x10);
       sum = (double)sum/12;
       sum = (double)(Math.round(sum*10.0)) / 10;
       return sum;
   }
   private String xep_hang(){
       double z = this.diem_tb();
       if(z >= 9){
           return "XUAT SAC";
       }
       else if(z >= 8){
           return "GIOI";
       }
       else if(z >= 7 ){
           return "KHA";
       }
       else if(z >= 5){
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
       if(this.diem_tb() < o.diem_tb()){
           return 1;
       }
       if(this.diem_tb() == o.diem_tb() && this.ma.compareTo(o.ma) > 0){
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
            Bang_diem sv = new Bang_diem(sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),
            sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Bang_diem xxx : ds){
            System.out.println(xxx);
        }
    }
}
