/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

/**
 *
 * @author admin
 */

public class Day_con_co_k_phan_tu_tang_dan {
    static int [] b = new int[100];
    static  ArrayList <Integer> a = new ArrayList<Integer>();
    public static void Try(int i , int k , int n){
        for(int j = b[i-1] +1 ;j <= n - k + i;j++){
              b[i] = j;
              if(i == k){
                  for(int l = 1; l <= k ;l++){
                      System.out.print(a.get(b[l] - 1)+ " ");
                      
                  }
                  System.out.println("");
              }
              else {
                  Try(i+1 , k ,n);
              }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t =sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
               
                for(int i=0;i<n;i++){
                    a.add( sc.nextInt());
                }
                Collections.sort(a , (o1,o2) -> o1.compareTo(o2));
                Try(1,k,n);
                a.clear();
        }
    }
}
