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
    String ma = "NV01";
    String ho_ten ;
    long luong_co_ban;
    long so_ngay_cong;
    String chuc_vu;
    long phu_cap;
    long thuong;
    void get_info(Scanner sc){
        ho_ten = sc.nextLine();
        luong_co_ban = Long.parseLong(sc.nextLine());
        so_ngay_cong = Long.parseLong(sc.nextLine());
        chuc_vu = sc.nextLine();
        
    }
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
    void in(){
        fix_thuong();
        System.out.println(ma + " " +ho_ten + " " + luong_co_ban*so_ngay_cong +" " +thuong+" "+phu_cap + " " +((luong_co_ban*so_ngay_cong)+thuong+phu_cap));
    }
}
public class Bai_Toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tinh_cong tc = new Tinh_cong();
        tc.get_info(sc);
        Map<String,Integer> map = new HashMap<String ,Integer>();
        map.put("GD" , 250000);
        map.put("PGD" , 200000);
        map.put("TP" , 180000);
        map.put("NV" , 150000);
        Set <String> set = map.keySet();
        for(String x : set){
            if(tc.chuc_vu.compareTo(x) == 0){
                tc.phu_cap = map.get(x);
                break;
            }
        }
        tc.in();
    }
}
