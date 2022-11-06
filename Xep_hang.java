/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class Pair implements Comparable<Pair>{
    private int a,b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    @Override
    public int compareTo(Pair o){
        if(this.a > o.a){
            return 1;
        }
        return -1;
    }
}
public class Xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        int n=t;
        ArrayList<Pair> ds = new ArrayList<Pair>();
        while(t-->0){
            Pair sv = new Pair(sc.nextInt(),sc.nextInt());
            ds.add(sv);
        }
        Collections.sort(ds);
        int s = 0;
        for(int i=0;i<n;i++){
            if(s < ds.get(i).getA()){
                s = ds.get(i).getA();
            }
            s+=ds.get(i).getB();
        }
        System.out.println(s);
    }
}
