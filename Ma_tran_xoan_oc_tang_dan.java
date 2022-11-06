/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ma_tran_xoan_oc_tang_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> mang = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mang.add(sc.nextInt());
            }
        }
        Collections.sort(mang , (o1,o2) -> o1.compareTo(o2));
        int h1 = 0 , h2 = n-1;
        int c1 = 0 , c2 = n-1;
        int cnt = 0;
        int [][] a = new int[n][n];
        while(c1 <= c2 && h1 <= h2){
            for(int i=c1;i<=c2;i++){
                a[h1][i] = mang.get(cnt++);
            }
            h1++;
            for(int i=h1 ; i<= h2 ;i++){
                a[i][c2] = mang.get(cnt++);
            }
            c2--;
            if(c1 <= c2){
                for(int i=c2 ;i >= c1 ;i--){
                    a[h2][i] = mang.get(cnt++);
                }
                h2--;
            }
            if(h1<=h2){
                for(int i=h2 ; i>= h1;i--){
                    a[i][c1] = mang.get(cnt++);
                }
                c1++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
