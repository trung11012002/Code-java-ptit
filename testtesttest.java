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
public class testtesttest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5+5];
        a[0] = 1;
        a[1] = 2 ;
        a[2] = 3;
        a[3] = 4;
        a[4] = 4;
        a[5] = 4;
        int vt = 0;
        int ll = 0;
        for(int i=0;i<=5;i++){
            if(a[i] != a[i+1]){
                vt++;
                ll = i;
            }
            if(vt >= 4){
                break;
            }
        }
        System.out.println(ll);
    }
}
