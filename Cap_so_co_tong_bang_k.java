/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int n = sc.nextInt();
            long [] a = new long[n];
            long k = sc.nextLong();
            for(int i=0;i<n;i++){
               a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long cnt=0;
            for(int i=0;i< n-1 ;i++){
               long up = upper_bound(a,i+1,n-1, k-a[i]);
               long dow = lower_bound(a, i+1 ,n-1, k-a[i]);
               if(dow <= n-1) cnt += (up-dow+1);
            }
            System.out.println(cnt);
        }      
    }
    public static long lower_bound(long [] a , int l , int r , long x){
        
        long ans = r + 1;
        while(l <= r){
            int m = (l+r) /2;
            if(a[m] == x){
                ans = m;
                r = m-1;
            }
            else if(a[m] > x){
                r = m -1;
            }
            else l = m+1;
        }
        return ans;
    }
    public static long upper_bound(long [] a , int l , int r , long x){
        
        long ans = r + 1;
        while(l <= r){
            int m = (l+r) /2;
            if(a[m] == x){
                ans = m;
                l = m+1;
            }
            else if(a[m] > x){
                r = m -1;
            }
            else l = m+1;
        }
        return ans;
    }
}
