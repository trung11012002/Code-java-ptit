/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class WordSet{
    private Set <String> set = new TreeSet<>();

    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String x = st.nextToken().toLowerCase();
            this.set.add(x);
        }
    }

    public WordSet() {
    }
    
    public WordSet union(WordSet o){
        WordSet tmp = new WordSet();
        tmp.set.addAll(this.set);
        tmp.set.addAll(o.set);
        return tmp;
    }
    public WordSet intersection(WordSet o){
        WordSet tmp = new WordSet();
        for(String x : this.set){
            if(o.set.contains(x)){
                tmp.set.add(x);
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
        String s = "";
        for(String x : this.set){
            s = s + x +" ";
        }
        return s;
    }
    
}
public class Tap_tu_khac_nhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
