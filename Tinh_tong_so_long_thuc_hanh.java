/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tinh_tong_so_long_thuc_hanh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String x = sc.next();
            try {
                Integer.parseInt(x);
            } catch (Exception e) {
                try {
                    sum+=Long.parseLong(x);
                } catch (Exception e1) {
                    
                }
            }
        }
        System.out.println(sum);
    }
    
}
