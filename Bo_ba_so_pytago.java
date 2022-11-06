/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
import java.math.*;

/**
 *
 * @author admin
 */
public class Bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt();
             ArrayList <Long> mang = new ArrayList<Long>();
             for(int i=0;i<n;i++){
                 mang.add(sc.nextLong());
             }
             Collections.sort(mang , (o1,o2) -> o1.compareTo(o2));
             int ok = 0;
             for(int i=0;i<n-1;i++){
                 for(int j=i+1;j<n;j++){
                     long xxx = mang.get(i)*mang.get(i) + mang.get(j)*mang.get(j);
                     long can = (int)(Math.sqrt(xxx));
                     if(can*can == xxx){
                         if(mang.contains(can)){
                             System.out.println("YES");
                             ok=1;
                             break;
                         }
                     }
                 }
             }
             if(ok == 0){
                 System.out.println("NO");
             }
        }
    }
}
