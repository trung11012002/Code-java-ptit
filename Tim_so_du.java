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
public class Tim_so_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger n = sc.nextBigInteger();
            
            BigInteger b = BigInteger.valueOf(4);
            BigInteger khong = BigInteger.valueOf(0);
            if(n.mod(b) == khong ){
                System.out.println("4");
            }
            else {
                System.out.println("0");
            }
        }
    }
}
