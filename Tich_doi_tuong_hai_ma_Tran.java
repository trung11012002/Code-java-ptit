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
public class Tich_doi_tuong_hai_ma_Tran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int [][] a = new int[n][m];
        int [][] b = new int [m][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j = 0 ; j< p ;j++){
                int res = 0;
                for(int k = 0; k< m;k++){
                    res+=a[i][k] * b[k][j];
                }
                System.out.print(res + " ");
            }
              System.out.println("");  
        }  
     }
}

