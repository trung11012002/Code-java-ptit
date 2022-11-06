/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.*;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class Sinh_vien {
    String masv = "B20DCCN";
    String Ho_ten;
    String Lop;
    String Ngay_sinh;
    Double GPA;
    void get_info(Scanner sc){
       
        Ho_ten = sc.nextLine();
        Lop = sc.nextLine();
        Ngay_sinh = sc.nextLine();
        GPA = Double.parseDouble(sc.nextLine());
    }
    void fix_ngay_sinh(){
        if(Ngay_sinh.charAt(2) != '/'){
            Ngay_sinh = "0" + Ngay_sinh;
            
        }
        if(Ngay_sinh.charAt(5) != '/'){
            Ngay_sinh = Ngay_sinh.substring(0, 3) + "0" + Ngay_sinh.substring(3);
        }
    }
    void in(){
        fix_ngay_sinh();
        System.out.print(masv + " " + Ho_ten  + Lop + " " + Ngay_sinh + " ");
        System.out.printf("%.2f\n" , GPA);
    }
}

public class Danh_sach_doi_tuong_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            Sinh_vien [] sv = new Sinh_vien[n];
            int x = 1;
            String xx = "";
            for(int i=0;i<n;i++){
                 sv[i] = new Sinh_vien();
                 sv[i].get_info(sc);
                 xx = x+"";
                 while(xx.length() < 3){
                     xx = "0" +xx;
                 }
                 sv[i].masv = sv[i].masv + xx;
                 x++;
            }
            for(int i=0;i<n;i++){
                String s = sv[i].Ho_ten;
                s = s.toLowerCase() ;
                String ss="";
                String xxx;
                StringTokenizer st = new StringTokenizer(s);
                while(st.hasMoreTokens()){
                    xxx=st.nextToken();
                    ss = ss + xxx.substring(0, 1).toUpperCase() + xxx.substring(1) + " ";
                }
                sv[i].Ho_ten = ss;
            }
            Sinh_vien temp = new Sinh_vien();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(sv[i].GPA < sv[j].GPA){
                        temp = sv[i];
                        sv[i] = sv[j];
                        sv[j] = temp;
                    }
                }
            }
            for(int i=0;i<n;i++){
               sv[i].in();
            } 
    }
}