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
public class So_0_va_So_9 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '9' && s.charAt(i) != '0') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = n;
            int z = 2;
            while(true){
                if(check((n+""))){
                    System.out.println(n);
                    break;
                }
                n = k*z;
                z++;
            }
        }
    }
}
