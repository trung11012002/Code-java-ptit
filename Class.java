/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Class {

    public static long kt(long a[], long k) {
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], (long) 1);
            }

        }
        long count = 0;
        for(int i = 0 ;i< a.length ;i++){
            if(map.get(k-a[i]) != null) count+=map.get(k-a[i]);
            if(k-a[i] == a[i]) count --;
        }
        return count / 2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] a = new long[n];
            long k = in.nextLong();

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();

            }
            System.out.println(kt(a, k));
        }
    }
}
