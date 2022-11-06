/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
import java.math.*;
/**
 *
 * @author admin
 */
 class Ds_mat_hang {
    String ma_mat_hang="";
    String ten_mat_hang="";
    String don_vi_tinh="";
    long gia_mua;
    long gia_ban;
    long loi_nhuan;
    public void get_info(Scanner sc){
        
        ten_mat_hang = sc.nextLine();
        don_vi_tinh = sc.nextLine();
        gia_mua = Long.parseLong(sc.nextLine());
        gia_ban = Long.parseLong(sc.nextLine());
        loi_nhuan = gia_ban - gia_mua;
    }
    public void in(){
        System.out.println("MH" + ma_mat_hang + " " + ten_mat_hang + " " + don_vi_tinh + " "+ gia_mua +" "+gia_ban +" " +loi_nhuan);
    }
}
public class Danh_sach_mat_hang {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = 1;
        Ds_mat_hang [] s1 = new Ds_mat_hang[n];
        for(int i=0;i<n;i++){
            s1[i] = new Ds_mat_hang();
            s1[i].get_info(sc);
            s1[i].ma_mat_hang = x + "";
            while( s1[i].ma_mat_hang.length() < 3){
                 s1[i].ma_mat_hang = "0" +  s1[i].ma_mat_hang;
            }
            x++;
        }
        Ds_mat_hang xxx = new Ds_mat_hang();
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                
            
            if(s1[i].loi_nhuan < s1[j].loi_nhuan){
                xxx = s1[i];
                s1[i] = s1[j];
                s1[j] = xxx;
            }
            if(s1[i].loi_nhuan == s1[j].loi_nhuan && s1[i].ma_mat_hang.compareTo(s1[j].ma_mat_hang) > 0){
                xxx = s1[i];
                s1[i] = s1[j];
                s1[j] = xxx;
            }
            }
        }
        for(int i=0;i<n;i++){
            s1[i].in();
        }
    }
}
