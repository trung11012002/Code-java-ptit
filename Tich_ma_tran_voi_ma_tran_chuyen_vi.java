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
public class Tich_ma_tran_voi_ma_tran_chuyen_vi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int ok= 0;
        while(t-->0){
            ok++;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int [][] a = new int [m][n];
            int [][] b = new int [n][m];
            int [][] kq = new int [m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Test "  + ok + ":");
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    int res=0;
                    for(int k=0;k<n;k++){
                        res += a[i][k]*b[k][j];
                    }
                    System.out.print(res + " ");
                }
                System.out.println("");
            }
        }
    }
    
}
