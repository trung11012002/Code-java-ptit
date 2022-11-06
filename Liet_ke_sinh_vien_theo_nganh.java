/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Vector;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author admin
 */
class Sinh_vien{
    String ma;
    String ho_ten;
    String lop;
    String email;
    void input(Scanner sc){
        ma = sc.nextLine();
        ho_ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
    }
}
public class Liet_ke_sinh_vien_theo_nganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Sinh_vien [] sv = new Sinh_vien [n];
        for(int i=0;i<n;i++){
            sv[i] = new Sinh_vien();
            sv[i].input(sc);
        }
        int t = Integer.parseInt(sc.nextLine());
        Vector<String> v = new Vector<String>();
        Map<String, String> map = new HashMap<String,String>();
        map.put("Ke toan","DCKT");
        map.put("Cong nghe thong tin" , "DCCN");
        map.put("An toan thong tin" , "DCAT");
        map.put("Vien thong", "DCVT");
        map.put("Dien tu", "DCDT");
        while(t-->0){
            v.add(sc.nextLine());
            
        }
        Set<String> set = map.keySet();
        for(String i : v){
            System.out.println("DANH SACH SINH VIEN NGANH " + i.toUpperCase() + ":");
            for(String j : set){
                if(i.compareTo(j) == 0 && i.compareTo("Cong nghe thong tin") == 0){
                    for(int k = 0;k<n;k++){
                        if((map.get(j)).compareTo(sv[k].ma.substring(3, 7)) == 0 && sv[k].lop.charAt(0) !='E'){
                            System.out.println(sv[k].ma + " " + sv[k].ho_ten +" " +sv[k].lop + " " +sv[k].email);
                            
                        }
                    }
                }
                else if(i.compareTo(j) == 0 && i.compareTo("An toan thong tin") == 0){
                    for(int k = 0;k<n;k++){
                        if((map.get(j)).compareTo(sv[k].ma.substring(3, 7)) == 0 && sv[k].lop.charAt(0) !='E'){
                            System.out.println(sv[k].ma + " " + sv[k].ho_ten +" " +sv[k].lop + " " +sv[k].email);
                            
                        }
                    }
                }
                else if(i.compareTo(j) == 0){
                    
                    for(int k = 0;k<n;k++){
                        if((map.get(j)).compareTo(sv[k].ma.substring(3, 7)) == 0){
                            System.out.println(sv[k].ma + " " + sv[k].ho_ten +" " +sv[k].lop + " " +sv[k].email);
                            
                        }
                    }
                }
            }
        }
    }
}
