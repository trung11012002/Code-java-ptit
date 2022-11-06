/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author admin
 */
public class Day_con_lien_tiep_co_tong_bang_k {
    static int [] x = new int [16];
    public static void Try(int i ,int n ,int a[] ,int kk , int ok){
        for(int j = 0;j<= 1;j++){
            x[i] = j;
            if(i == n){
                int sum = 0;
                for(int k=1;k<=n;k++){
                    if(x[k] == 1){
                        System.out.print(a[k-1] +" ");
                    }
                    if(x[k] == 0 ){
                       if(sum == kk){
                           ok=1;                         
                       }
                       sum = 0;
                    }
                    else {
                        sum += a[k-1];
                    }
                }
                System.out.println("");
            }
            else {
                Try(i+1,n,a ,kk , ok);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int kk = sc.nextInt();
            int [] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int ok = 0;
            Try(1 , n,a , kk ,ok);
            if(ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
