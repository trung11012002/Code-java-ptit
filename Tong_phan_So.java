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
public class Tong_phan_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x1 = sc.nextBigInteger();
        BigInteger y1 = sc.nextBigInteger();
        BigInteger x2 = sc.nextBigInteger();
        BigInteger y2 = sc.nextBigInteger();
        BigInteger tu1 = (x1.multiply(y2));
        BigInteger tu2 = (x2.multiply(y1));
        BigInteger tu = tu1.add(tu2);
        BigInteger mau = y1.multiply(y2);
        BigInteger ucln = tu.gcd(mau);
        
        System.out.println(tu.divide(ucln) + "/" + mau.divide(ucln));
    }
}
