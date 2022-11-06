/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class IntSet{
    private Set<Integer> set =  new TreeSet<Integer> ();
    public IntSet(int a[]) {
        for(Integer x : a){
           this.set.add(x);
        }
    }
    public IntSet(){
        //set = new TreeSet();
    }
    public IntSet union(IntSet o){
        Set<Integer> set1 =  new TreeSet<Integer>();
        IntSet tmp = new IntSet();
        for(Integer x : this.set){
             set1.add(x);
        }
        for(Integer x : o.set){
            set1.add(x);
        }
        tmp.set.addAll(set1);
        return tmp;
    }

    @Override
    public String toString() {
        String s = "";
        for(Integer x : set){
            s = s + x +" ";
        }
        return s;
    }
    
}
public class Lop_intset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
