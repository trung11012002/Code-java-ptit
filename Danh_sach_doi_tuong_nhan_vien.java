/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
class Nhan_vien{
    String ma;
    String ho_ten;
    String sex;
    String ngay_sinh; 
    String dia_chi;
    String ma_thue;
    String ngay_ki_hd;
    void get_info(Scanner sc){
        ho_ten = sc.nextLine();
        sex = sc.nextLine();
        ngay_sinh = sc.nextLine();
        dia_chi = sc.nextLine();
        ma_thue = sc.nextLine();
        ngay_ki_hd = sc.nextLine();
    }
    void in(){
        System.out.println(ma + " " + ho_ten + " " + sex + " " + ngay_sinh +" " + dia_chi + " " +ma_thue +" " + ngay_ki_hd);
    }
}

/**
 *
 * @author admin
 */
public class Danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Nhan_vien [] nv = new Nhan_vien[n];
        int x =1;
        for(int i=0;i<n;i++){
            nv[i] = new Nhan_vien();
            nv[i].get_info(sc);
            String xx = x+"";
            while(xx.length() < 5){
                xx = "0" + xx;
            }
            nv[i].ma = xx;
            x++;
        }
        Nhan_vien xxx = new Nhan_vien();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String k = nv[i].ngay_sinh;
                String kk = nv[j].ngay_sinh;
                if(k.substring(6).compareTo(kk.substring(6)) > 0){
                    xxx = nv[i];
                    nv[i] = nv[j];
                    nv[j] = xxx;
                }
                if(k.substring(6).compareTo(kk.substring(6)) == 0 && k.substring(3, 5).compareTo(kk.substring(3,5)) > 0){
                    xxx = nv[i];
                    nv[i] = nv[j];
                    nv[j] = xxx;
                }
                if(k.substring(6).compareTo(kk.substring(6)) == 0 && k.substring(3, 5).compareTo(kk.substring(3,5)) == 0 && k.substring(0,2).compareTo(kk.substring(0,2)) > 0){
                    xxx = nv[i];
                    nv[i] = nv[j];
                    nv[j] = xxx;
                }
            }
        }
        for(int i=0;i<n;i++){
            nv[i].in();
        }
    }
    
}
