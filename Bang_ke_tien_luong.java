/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
import java.util.HashSet;
/**
 *
 * @author admin
 */
class Tinh_cong{
    String ma = "NV";
    String ho_ten ;
    long luong_co_ban;
    long so_ngay_cong;
    String chuc_vu;
    long phu_cap;
    long thuong;
    long thu_nhap;
    void fix_thuong(){
        if(so_ngay_cong >= 25){
            thuong = (luong_co_ban*so_ngay_cong)*20/100;
            
        }
        else if(so_ngay_cong < 25 && so_ngay_cong >= 22){
            thuong = (luong_co_ban*so_ngay_cong)*10/100;
            
        }
        else {
            thuong = 0;
        }
    }
    void get_info(Scanner sc){
        ho_ten = sc.nextLine();
        luong_co_ban = Long.parseLong(sc.nextLine());
        so_ngay_cong = Long.parseLong(sc.nextLine());
        chuc_vu = sc.nextLine();
         fix_thuong();
    }
    
    void in(){
       
        System.out.println(ma + " " +ho_ten + " " + luong_co_ban*so_ngay_cong +" " +thuong+" "+phu_cap + " " +((luong_co_ban*so_ngay_cong)+thuong+phu_cap));
    }
}
public class Bang_ke_tien_luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Tinh_cong [] tc = new Tinh_cong[n];
        Map<String,Integer> map = new HashMap<String ,Integer>();
        map.put("GD" , 250000);
        map.put("PGD" , 200000);
        map.put("TP" , 180000);
        map.put("NV" , 150000);
        Set <String> set = map.keySet();
        int x = 1;
        for(int i=0;i<n;i++){
            tc[i] = new Tinh_cong();
            tc[i].get_info(sc);
            String xx = x+"";
            while(xx.length() < 2){
                xx = "0" +xx;
            }
            tc[i].ma += xx;
            x++;
            for(String z : set){
                if(tc[i].chuc_vu.compareTo(z) == 0){
                    tc[i].phu_cap = map.get(z);
                    break;
                }
            }
            tc[i].thu_nhap =((tc[i].luong_co_ban*tc[i].so_ngay_cong)+ tc[i].thuong+tc[i].phu_cap);
        }
        Tinh_cong xxx = new Tinh_cong();
        for(int i=0;i < n-1;i++){
            for(int j =i+1;j<n;j++){
                if(tc[i].thu_nhap < tc[j].thu_nhap){
                    xxx = tc[i];
                    tc[i] =tc[j];
                    tc[j] = xxx;
                }
            }
        }
        for(int i=0;i<n;i++){
            tc[i].in();
        }
      
    }
}
