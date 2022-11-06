/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
import java.math.BigInteger;

/**
 *
 * @author admin
 */
public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        BigInteger a = sc.nextBigInteger();
        BigInteger b = BigInteger.valueOf(11);
        long c = (a.mod(b)).longValue();
        if(c==0){
            System.out.println("1");
        }
        else System.out.println("0");
        }

    }
}
