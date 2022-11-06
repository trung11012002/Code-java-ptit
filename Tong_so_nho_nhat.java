/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tong_so_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] a = new int [n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long x=0;
            long y=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    x = x *10 + a[i];
                }
                else y = y*10+a[i];
            }
            System.out.println((x+y));
        }
    }
}
