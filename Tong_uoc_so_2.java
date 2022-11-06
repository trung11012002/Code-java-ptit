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
public class Tong_uoc_so_2 {
    public static int check(int n){
        int sum = -n;
        for(int i=1;i<=Math.sqrt(n) ;i++){
            if(n%i == 0){
                int j = n / i ;
                if(i == j) sum+=i;
                else {
                    sum += (i+j);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(check(i) > i) cnt++;
        }
        System.out.println(cnt);
    }
}
