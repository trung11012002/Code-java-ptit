/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Tong_uoc_so_1 {
    static int a[] = new int[2000001];
    public static void Era() {
        for (int i = 2; i * i <= 2000000; i++)
            if (a[i] == 0)
                for (int j = i * i; j <= 2000000; j += i)
                    a[j] = i;
        for (int i = 2; i <= 2000000; i++)
            if (a[i] == 0)
                a[i] = i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Era();
        Long s = 0L;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            while (n != 1) {
                s += a[n];
                n /= a[n];
            }
        }
        System.out.print(s);
    }
}
