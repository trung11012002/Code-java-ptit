/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.*;
/**
 *
 * @author admin
 */
public class Liet_ke_va_dem {
    static int check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i+1)) return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("C:\\CODE JAVA FILE\\DATA.txt"));
        Map<Long , Integer > map =  new LinkedHashMap<>();
        while(sc.hasNext()){
            long n = sc.nextLong();
            if(check(n+"") == 1){
                if(map.containsKey(n)){
                    map.put(n, map.get(n) + 1);
                }
                else map.put(n , 1);
            }
        }
        Set<Entry<Long , Integer>> entries = map.entrySet();
        List<Entry<Long,Integer>> list = new ArrayList<>();
        list.addAll(entries);
        Comparator <Entry<Long ,Integer>> comparator = new Comparator<Entry<Long , Integer>>() {
            @Override
            public int compare(Entry<Long , Integer> e1 , Entry<Long , Integer> e2){
                Integer s1 = e1.getValue();
                Integer s2 = e2.getValue();
                return s2.compareTo(s1);
            }
        };
        Collections.sort(list , comparator);
        for(Entry<Long , Integer> x : list){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        
    }
}
