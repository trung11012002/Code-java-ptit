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

public class Hinh_Sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            a[y]++;
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] != 1 && a[i] != n - 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}