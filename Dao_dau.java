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
public class Dao_dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] a = new long[n];
        long k = sc.nextLong();
        long ss = 0;
        long s=0; 
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if (a[i] < 0) ss++;
        }
        Arrays.sort(a);
        if (ss > 0){
            if(ss > k){
                for(int i=0;i<k;i++){
                    a[i] *= -1;
                }
            }
            else {
                for(int i=0;i<ss;i++){
                    a[i]*=-1;
                }
                Arrays.sort(a);
                k -= ss;
                if(k%2 ==1){
                    a[0] *=-1;
                }
            }
        }
        else if(k%2 == 1) a[0] *= -1;
        for(int i =0;i<n;i++){
            s+=a[i];
        }
        System.out.println(s);     
    }
}
