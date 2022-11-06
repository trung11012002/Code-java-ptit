/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class In_ma_tran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [][] a = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] =sc.nextInt();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i%2 == 0){
                        System.out.print(a[i][j] + " ");
                    }
                    else {
                        System.out.print(a[i][n-j-1] + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
