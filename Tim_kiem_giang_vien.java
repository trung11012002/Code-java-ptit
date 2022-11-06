/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author admin
 */
class Giang_vien{
    String ma="GV";
    String ten;
    String bo_mon;
    void input(Scanner sc){
        ten= sc.nextLine();
        bo_mon = sc.nextLine();
    }
}
public class Tim_kiem_giang_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Giang_vien [] gv = new Giang_vien[n];
        int x =1;
        for(int i=0;i<n;i++){
            gv[i] = new Giang_vien();
            gv[i].input(sc);
            String xxx = x+"";
            while(xxx.length()<2){
                xxx="0"+xxx;
            }
            gv[i].ma = gv[i].ma + xxx;
            x++;
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            s=s.toLowerCase();
            for(int i=0;i<n;i++){
                String ss = gv[i].ten.toLowerCase();
                if(ss.contains(s)){
                    System.out.print(gv[i].ma +" " + gv[i].ten +" ");
                    String v = gv[i].bo_mon;
                    StringTokenizer st = new StringTokenizer(v);
                    while(st.hasMoreTokens()){
                        String c = st.nextToken();
                        System.out.print((c.charAt(0)+"").toUpperCase());
                        
                    }
                    System.out.println("");
                }
            }
            
        }
    }
}
