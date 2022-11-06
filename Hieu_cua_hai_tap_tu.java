/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
class WordSet{
    private Set<String> set = new TreeSet<String>();
    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }

    public WordSet() {
    }
    public WordSet difference(WordSet o){
        WordSet tmp = new WordSet();
        for(String x : this.set){
            if(!o.set.contains(x)){
                tmp.set.add(x);
            }
        }
        return tmp;
    }
    @Override
    public String toString() {
        String s ="";
        for(String x : this.set){
            s = s+ x+" ";
        }
        return s;
    }
    
}
public class Hieu_cua_hai_tap_tu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("C:\\CODE JAVA FILE\\DATA.txt");
        WordSet s2 = new WordSet("C:\\CODE JAVA FILE\\VANBAN.txt");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

