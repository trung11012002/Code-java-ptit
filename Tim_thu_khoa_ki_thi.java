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
class Thi_sinh{
    String ma="";
    String ho_ten ;
    String ngay_sinh;
    Double diem1;
    Double diem2;
    Double diem3;
    void input(Scanner sc){
        ho_ten = sc.nextLine();
        ngay_sinh = sc.nextLine();
        diem1 = Double.parseDouble(sc.nextLine());       
        diem2 = Double.parseDouble(sc.nextLine());
        diem3 = Double.parseDouble(sc.nextLine());
    }
}
public class Tim_thu_khoa_ki_thi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Thi_sinh [] ts = new Thi_sinh [n];
        int x=1;
        for(int i=0;i<n;i++){
             ts[i] = new Thi_sinh();
             ts[i].input(sc);
             ts[i].ma = x+"";
             x++;
        }
        double thu_khoa = 0;
        for(int i=0;i<n;i++){
            double c = ts[i].diem1 + ts[i].diem2 + ts[i].diem3 ;
            if(c > thu_khoa){
                thu_khoa = c;
            }
        }
        for(int i=0;i<n;i++){
            double c = ts[i].diem1 + ts[i].diem2 + ts[i].diem3 ;
            if(c == thu_khoa){
                System.out.println(ts[i].ma + " " + ts[i].ho_ten +" "+ ts[i].ngay_sinh + " " +thu_khoa);
            }
        }
    }
}
