/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ghep_ma{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<String> list1 = (ArrayList<String>) sc.readObject();
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) sc.readObject();
        Set<String> set1 = new TreeSet<String>();
        set1.addAll(list1);
        
        Set<Integer> set2 = new TreeSet<Integer>();
        set2.addAll(list2);
        for (String x : set1) {
            for (Integer xx : set2) {
                System.out.println(x + xx);
            }
        }
    }
}