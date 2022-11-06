/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author admin
 */
class Tuyen_sinh{
    String ma_thi_sinh;
    String Ho_ten;
    double diem_toan;
    double diem_ly;
    double diem_hoa;
    double uu_tien;
    double diem_chuan;
    void get_info(Scanner sc){
        ma_thi_sinh = sc.nextLine();
        Ho_ten = sc.nextLine();
        diem_toan = Double.parseDouble(sc.nextLine());
        diem_ly = Double.parseDouble(sc.nextLine());
        diem_hoa = Double.parseDouble(sc.nextLine());
    }
    void in(){
        diem_chuan = diem_toan * 2 + diem_ly + diem_hoa +uu_tien;
        System.out.print(ma_thi_sinh + " " + Ho_ten + " ");
        if(uu_tien == 1.0){
            System.out.print("1" +" ");
        }
        else {
            System.out.print(uu_tien + " ");
        }
        double a = diem_toan * 2 + diem_ly + diem_hoa;
        String xxx = a +"";
        int c;
        if(xxx.charAt(xxx.length() -1 ) == '0'){
            c = (int)(a);
            System.out.print( c +" ");
        }
        else {
            System.out.print(a +" ");
        }
        if(diem_chuan >= 24){
            System.out.print("TRUNG TUYEN");
        }
        else {
             System.out.print("TRUOT");
        }
    }
}
public class Bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Double> map = new HashMap<String,Double>();
        map.put("KV1", 0.5);
        map.put("KV2", 1.0);
        map.put("KV3", 2.5);
        Tuyen_sinh ts = new Tuyen_sinh();
        ts.get_info(sc);
        String s = ts.ma_thi_sinh.substring(0, 3);
        Set<String> set = map.keySet();
        for(String x : set){
            if(x.compareTo(s) == 0){
                ts.uu_tien = map.get(x);
                break;
            }
        }
        ts.in();
    }
}
