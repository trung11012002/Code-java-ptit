/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author admin
 */
class Sinh_vien{
    String ma;
    String ten;
    String lop;
    Double diem1;
    Double diem2;
    Double diem3;
    void input(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        diem1 = Double.parseDouble(sc.nextLine());
        diem2 = Double.parseDouble(sc.nextLine());
        diem3 = Double.parseDouble(sc.nextLine());
    }
}
public class Bang_diem_thanh_phan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Sinh_vien[] sv = new Sinh_vien[n];
        
        for(int i =0;i <n;i++){
            sv[i] = new Sinh_vien();
            sv[i].input(sc);
            
        }
        Sinh_vien xxx = new Sinh_vien();
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(sv[i].ten.compareTo(sv[j].ten) > 0){
                    xxx = sv[i];
                    sv[i] = sv[j];
                    sv[j] = xxx;
                }
            }
        }
        int x=1;
        for(int i=0;i<n;i++){
            System.out.print(x + " " + sv[i].ma +" " + sv[i].ten +" "+sv[i].lop+" ");
            System.out.printf("%.1f %.1f %.1f\n" , sv[i].diem1 , sv[i].diem2 , sv[i].diem3);
            x++;
        }
    }
}
