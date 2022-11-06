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
public class Phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger tu = sc.nextBigInteger();
        BigInteger mau = sc.nextBigInteger();
        BigInteger ucln = tu.gcd(mau);
        System.out.println(tu.divide(ucln) + "/" + mau.divide(ucln));
    }
}
