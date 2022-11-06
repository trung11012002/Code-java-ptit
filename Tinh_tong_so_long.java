/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author admin
 */
public class Tinh_tong_so_long {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String x = sc.next();
            try {
                Integer.parseInt(x);
            } catch (NumberFormatException e) {
                try {
                    sum+=Long.parseLong(x);
                } catch (NumberFormatException e1) {
                    continue;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
