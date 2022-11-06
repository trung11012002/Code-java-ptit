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
public class Xu_ly_van_ban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kq = "";
        while(sc.hasNext()){
            String s =  sc.next();
            s = s.toLowerCase();
            int k = s.length();
            if(s.charAt(k-1) == '!' || s.charAt(k-1) == '.' || s.charAt(k-1) == '?'){
                kq += s.substring(0 , k-1);            
                if(kq.length() >= 1) {
                    String z = (kq.charAt(0)+"").toUpperCase();
                    String zz = kq.substring(1);
                    System.out.println(z + zz);
                }
                kq = "";
            }
            else kq = kq + s +" ";
        }
    }
}
