/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Day_Con_tang_dan {
    static int b [] = new int [25];
    static ArrayList<String> mang = new ArrayList<String>();
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static int check2(){
        int tong = 0;
        for(int i=0; i <arr.size();i++){
            tong+=arr.get(i);
        }
        if(tong%2==1) return 1;
        return 0;
    }
    public static void check(int i, int n , int a[]){
        for(int j=0;j <= 1;j++){
            b[i] = j;
            if(i==n){
                String s="";
                arr.clear();
                for(int k=1;k<=n;k++){
                    if(b[k] == 1){
                        arr.add(a[k]);                   
                    }
                }
                if(check2() == 1){
                    s = arr.get(0)+"";
                    for(int l = 1;l <arr.size() ;l++){
                        s = s + " " +arr.get(l);
                    }
                    mang.add(s);
                }
                
            }
            else check(i+1 , n ,a);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int [] a = new int [n+1];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=1;i<=n-1;i++){
                for(int j=i+1;j<=n;j++){
                    if(a[i] < a[j]) {
                        int tmp = a[i];
                        a[i] =a[j];
                        a[j] = tmp;
                    }
                }
            }
            check(1,n,a);
            Collections.sort(mang, (o1,o2) -> o1.compareTo(o2));
            for(String xxx : mang){
                System.out.println(xxx);
            }
            mang.clear();
            arr.clear();
        }
    }
}