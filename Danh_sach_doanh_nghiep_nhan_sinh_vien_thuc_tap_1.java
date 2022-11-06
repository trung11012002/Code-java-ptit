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
class Ds{
    String ma;
    String ten;
    long so_sv;
    void input(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        so_sv = Long.parseLong(sc.nextLine());
    }
}
public class Danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Ds [] ds = new Ds[n];
        for(int i=0;i<n;i++){
            ds[i] = new Ds();
            ds[i].input(sc);
        }
        Ds xxx = new Ds();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ds[i].so_sv  < ds[j].so_sv){
                    xxx=ds[i];
                    ds[i] = ds[j];
                    ds[j] = xxx;
                }
                if(ds[i].so_sv  == ds[j].so_sv&& ds[i].ma.compareTo(ds[j].ma) > 0){
                    xxx=ds[i];
                    ds[i] = ds[j];
                    ds[j] = xxx;
                }
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a +" DEN " +b+" SINH VIEN:");
            for(int i=0;i<n;i++){
                if(ds[i].so_sv >= a && ds[i].so_sv <= b){
                    System.out.println(ds[i].ma +" " + ds[i].ten +" " + ds[i].so_sv);
                }
            }
        }
    }
}
