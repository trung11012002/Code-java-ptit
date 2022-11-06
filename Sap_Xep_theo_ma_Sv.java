/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Vector;
import java.util.*;
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
public class Sap_Xep_theo_ma_Sv {
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
        while(t-->0){
            v.add(sc.nextLine());
            
        }
        for(String i : v){
            System.out.println("DANH SACH SINH VIEN KHOA " + i + ":");
            for(int j=0;j<n;j++){
               if(i.substring(2).compareTo(sv[j].lop.substring(1, 3)) == 0){
                   System.out.println(sv[j].ma + " " + sv[j].ho_ten +" " +sv[j].lop + " " +sv[j].email);
               }
            }
        }
    }
}
