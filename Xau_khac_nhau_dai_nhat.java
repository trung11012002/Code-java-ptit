/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author admin
 */
public class Xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if (a.compareTo(b) == 0)
                System.out.println(-1);
            else
                System.out.println(Math.max(a.length(), b.length()));
        }
        sc.close();
    }
    
}
