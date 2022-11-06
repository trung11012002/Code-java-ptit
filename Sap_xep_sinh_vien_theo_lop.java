/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
/**
 *
 * @author admin
 */
class Sinh_vien{
    String ma;
    String ten;
    String lop;
    String email;
    void input(Scanner sc){
        ma = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
    }
}
public class Sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Sinh_vien [] sv = new Sinh_vien[n];
        for(int i=0;i<n;i++){
            sv[i] = new Sinh_vien();
            sv[i].input(sc);
        }
        Sinh_vien xxx = new Sinh_vien();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(sv[i].lop.compareTo(sv[j].lop) > 0){
                    xxx = sv[i];
                    sv[i] =sv[j];
                    sv[j] = xxx;
                }
                if(sv[i].lop.compareTo(sv[j].lop) == 0 && sv[i].ma.compareTo(sv[j].ma) > 0){
                    xxx = sv[i];
                    sv[i] =sv[j];
                    sv[j] = xxx;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(sv[i].ma + " " + sv[i].ten +" " + sv[i].lop +" " +sv[i].email);
        }
    }
}
