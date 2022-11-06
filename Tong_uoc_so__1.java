/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Tong_uoc_so__1 {
    static int [] a = new int [1000001];
    public static void sang(){
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(a[i] == 0){
                for(int j=i*i;j<=1000000;j+=i){
                    a[j] = i;
                }
            }
        }
        for(int i=0;i<=1000000;i++){
            if(a[i] == 0){
                a[i] = i;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;
        for(int i=x;i<=y;i++){
            long sum  = 0;
            int n  = i;
            int zzz= n;
            Map<Integer,Integer> map = new HashMap<>();
            while(n > 1){
                if(map.get(a[n]) != null){
                    map.put(a[n] , map.get(a[n]) + 1);
                }
                else map.put(a[n] , 1);
                n /= a[n];
            }
            Set<Integer> set = map.keySet();
            long tich = 1;
            for(Integer z : set){
                long luythua = (long) (Math.pow(z, map.get(z)+1) - 1);
                long thanhphan = luythua/(z-1);
                tich *= thanhphan;
            }
            sum+=tich;
            sum-=zzz;
            map.clear();
            if(sum > zzz) cnt++;
        }
        System.out.println(cnt);
    }
}
