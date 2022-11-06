/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
import java.util.Vector;
/**
 *
 * @author admin
 */
class Ds_giang_vien{
    String ma="GV";
    String ho_ten;
    String bo_mon;
   // String viet_tat = "";
  //  String ten="";
    void input(Scanner sc){
        ho_ten = sc.nextLine();
        bo_mon = sc.nextLine();
//        String s = bo_mon.toUpperCase();
//        String ss="";
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()){
//            String c = st.nextToken();
//            ss += c.charAt(0);
//        }
//        viet_tat = ss;
//        String x="";
//        StringTokenizer st2 = new StringTokenizer(ho_ten);
//        while(st2.hasMoreTokens()){
//            x = st2.nextToken();
//        }
//        ten = x ;
    }
}
public class Danh_sach_giang_vien_theo_bo_mon {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Ds_giang_vien [] gv = new Ds_giang_vien[n];
    int x = 1;
    for(int i=0;i<n;i++){
        gv[i] = new Ds_giang_vien();
        gv[i].input(sc);
        String xx = x+"";
        while(xx.length() < 2){
            xx = "0" +xx;
        }
        gv[i].ma = gv[i].ma + xx;
        x++;
    }
    int t = Integer.parseInt(sc.nextLine());
    Vector<String> v  = new Vector<String>();
    while(t-->0){
        String s = sc.nextLine();
        v.add(s);
    }
    Ds_giang_vien xxx = new Ds_giang_vien();
    for(String i : v){
        String s = i.toUpperCase();
        String ss="";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String c = st.nextToken();
            ss += c.charAt(0);
        }
        System.out.println("DANH SACH GIANG VIEN BO MON " + ss +":");
        for(int j=0;j<n;j++){
            if(i.compareTo(gv[j].bo_mon) == 0){
              System.out.println(gv[j].ma + " " + gv[j].ho_ten +" " + ss);
            }
        }
    }
    }
}
