/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class Xau_day_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int k =sc.nextInt();
            Set <Character> set = new HashSet(); 
            for(int i=0;i < s.length();i++){
                set.add(s.charAt(i));
            }
            if(k+set.size() >= 26){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
