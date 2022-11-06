/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class WordSet{
    private String s;
    Set<String> set = new TreeSet<String>();
    Set<String> set1 = new TreeSet<String>();
    Set<String> set2 = new TreeSet<String>();
    public WordSet(String s) {
        this.s = s;
    }
    public String union(WordSet o){
        String [] words1 = this.s.split(" ");
        String [] words2 = o.s.split(" ");
        for(String x : words1){
            String xx = x.toLowerCase();
            set.add(xx);
        }
        for(String x : words2){
            String xx = x.toLowerCase();
            set.add(xx);
        }
        String z="";
        for(String x : set){
            z = z + x +" ";
        }
        set.clear();
        return z;
    }
    public String intersection(WordSet o){
        String [] words1 = this.s.split(" ");
        String [] words2 = o.s.split(" ");
        for(String x : words1){
            String xx = x.toLowerCase();
            set1.add(xx);
        }
        for(String x : words2){
            String xx = x.toLowerCase();
            set2.add(xx);
        }
        String z="";
        for(String x : set1){
            if(set2.contains(x)){
                z = z + x +" ";
            }
        }
        return z;
    }
}
public class WordSet1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
