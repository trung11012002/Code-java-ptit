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
public class day_con_co_tong_nguyen_to {
    static int [] x = new int [16];
    public static boolean ng_to(int n){
        if(n < 2) return false;
        for(int i=2;i <= (int)Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void Try(int i ,int n ,int a[]){
        for(int j = 0;j<= 1;j++){
            x[i] = j;
            if(i == n){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for(int k=1;k<=n;k++){
                    if(x[k] == 1){
                        arr.add(a[k-1]);
                       
                    }
                }
                if(!arr.isEmpty()){
                    int sum = 0;
                    for(Integer z : arr){
                        sum+=z;
                    }
                    if(ng_to(sum)){
                      
                       String s=arr.get(0)+"";
                       for(int k = 1;k<arr.size();k++){
                           s = s +" "+arr.get(k);
                       }
                        System.out.println(s);
                    }
                }
                arr.clear();
            }
            else {
                Try(i+1,n,a);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] b = new int[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            int [] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = b[n-i-1];
            }
            Try(1 , n,a);
        }
    }
}
