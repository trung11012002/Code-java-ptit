/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;


import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author admin
 */
class Phan_so{
    long tu;
    long mau;
    void input(Scanner sc){
        tu = sc.nextLong();
        mau = sc.nextLong(); 
    }
    void check1(Phan_so b , Phan_so c){
        long tu1 = this.tu * b.mau;
        long tu2 = b.tu * this.mau;
        long tu0 = tu1+tu2;
        BigInteger a1 = BigInteger.valueOf(tu0*tu0);
        BigInteger b1 = BigInteger.valueOf((this.mau*b.mau)*(this.mau*b.mau));
        BigInteger gcd = a1.gcd(b1);
        System.out.print(a1.divide(gcd) + "/" + b1.divide(gcd) + " ");
        String s = (a1.divide(gcd)).toString();
        String ss =(b1.divide(gcd)).toString();
        
        c.tu = Long.valueOf(s);
        c.mau = Long.valueOf(ss);
    }
    void check2(Phan_so b ,Phan_so c){
        BigInteger a1 = BigInteger.valueOf(this.tu * b.tu * c.tu);
        BigInteger b1 = BigInteger.valueOf(this.mau * b.mau*c.mau);
        BigInteger gcd = a1.gcd(b1);
        System.out.println(a1.divide(gcd) + "/" + b1.divide(gcd));
    }
}
public class Tinh_toan_phan_So {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Phan_so A = new Phan_so();
            Phan_so B = new Phan_so();
            Phan_so C = new Phan_so();
            A.input(sc);
            B.input(sc);
            A.check1(B,C);
            A.check2(B,C);
        }
    }
}
