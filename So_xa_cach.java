/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
import java.math.*;
/**
 *
 * @author admin
 */
public class So_xa_cach {
    public static int n;
    public static int [] a = new int [100];
    public static int [] check = new int[100];
    public static int kiem_tra(int a[],int n){
        for(int i=1;i<=n-1;i++){
            if((int)(Math.abs((a[i] - a[i+1]))) == 1){
                return 0;
            }
        }
        return 1;
    }
    public static void Try(int i,int n){
        for(int j=1;j<=n;j++){
            if(check[j] == 0){
                a[i] = j;
                check[j] =1;
                if(i==n){
                    if(kiem_tra(a , n) == 1){
                        for(int k=1;k<=n;k++){
                            System.out.print(a[k]);
                        }
                        System.out.println("");
                    }
                }
                else {
                    
                    Try(i+1 , n);
                }
                check[j] = 0;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             n = sc.nextInt();
             Try(1 , n);
        }
    }
    
}
