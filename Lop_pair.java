/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.math.*;

/**
 *
 * @author admin
 */
class Pair<T1,T2> {
    private int first;
    private int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    private int ngto(int n){
        for(int i=2;i <= Math.sqrt(n) ;i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public boolean isPrime(){
        if(ngto(this.first) == 1 && ngto(this.second) == 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
    
}
public class Lop_pair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
