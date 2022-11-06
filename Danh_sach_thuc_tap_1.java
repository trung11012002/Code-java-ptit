/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Thuc_tap{
    int id;
    String ma;
    String ten;
    String lop;
    String email;
    String doanh_nghiep;
    void input(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
        doanh_nghiep = sc.nextLine();
    }
}
public class Danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Thuc_tap[] tt = new Thuc_tap[n];
        int x =1;
        for(int i=0;i<n;i++){
            tt[i] = new Thuc_tap();
            tt[i].input(sc);
            tt[i].id = x;
            x++;
        }
        Thuc_tap xxx = new Thuc_tap();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(tt[i].ma.compareTo(tt[j].ma) >0 ){
                    xxx = tt[i];
                    tt[i]=tt[j];
                    tt[j] =xxx;
                }
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            for(int i=0;i<n;i++){
            if(s.compareTo(tt[i].doanh_nghiep)==0){
                System.out.println(tt[i].id + " " + tt[i].ma +" "+tt[i].ten +" "+tt[i].lop+" "+tt[i].email +" "+tt[i].doanh_nghiep);
            }
            }
        }
        
    }
}
