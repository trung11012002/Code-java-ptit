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
public class Phan_tu_ben_phai_dau_tien_lon_hon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long [] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                int ok = 0;
                for(int j=i+1;j<n;j++){
                    if(a[i] < a[j]){
                        ok=1;
                        System.out.print(a[j] +" ");
                        break;
                    }
                }
                if(ok == 0){
                    System.out.print("-1" +" ");
                }
            }
            System.out.println("");
        }
    }
}
