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
public class Sap_xep_ma_tran_TH {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            ArrayList<Integer> ds = new ArrayList<Integer>();
            int [][] a = new int [n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    if(j == q-1){
                        ds.add(a[i][j]);
                    }
                }
            }
            Collections.sort(ds);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){                  
                    if(j == q-1){
                        System.out.print(ds.get(i) + " ");
                    }
                    else {
                        System.out.print(a[i][j] +" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
