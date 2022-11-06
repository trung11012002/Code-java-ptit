/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author admin
 */
public class Nho_nhat_Va_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            int n=sc.nextInt();
            if(n == 0){
                ok=false;
                break;
            }
            String [] a = new String[n] ;
            for(int i=0;i<n;i++){
                a[i] = sc.next();
            }
            BigInteger min = new BigInteger(a[0] , 10);            
            BigInteger max = new BigInteger(a[0] , 10 );
            for(int i = 0 ;i < n;i++){
                BigInteger x = new BigInteger(a[i] ,10);
                if(x.compareTo(max) > 0) max =x;
                if(x.compareTo(min) < 0) min =x;
            }
            if(min.compareTo(max)==0){
                System.out.println("BANG NHAU");
            }
            else System.out.println(min + " " + max);
        }
    }
}
