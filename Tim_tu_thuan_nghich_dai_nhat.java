/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Tim_tu_thuan_nghich_dai_nhat {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("C:\\CODE JAVA FILE\\DATA.txt"));
        Map<String , Integer> map = new LinkedHashMap<String ,Integer>();
        int len = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length() == len && check(s)){
                if(map.containsKey(s)){
                    map.put(s, map.get(s) +1);
                }
                else {
                    map.put(s, 1);
                }
            }
            if(s.length() > len && check(s)){
                map.clear();
                map.put(s, 1);
                len = s.length();
            }          
        }
        Set<String> set = map.keySet();
        for(String x : set){
                System.out.println(x +" "+map.get(x));
            }
        }
    }
