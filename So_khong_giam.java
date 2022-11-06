/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class So_khong_giam {
    public static boolean soKhongGiam(String s){
        if(s.length() < 2) return false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 =new  ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) sc2.readObject();
        Map<Integer ,Integer> map1 = new TreeMap<Integer , Integer>();
        Map<Integer ,Integer> map2 = new TreeMap<Integer , Integer>();
        for(Integer x : ds1){
            String check = x+"";
            if(soKhongGiam(check)){
                if(map1.containsKey(x)){
                    map1.put(x , map1.get(x) + 1);
                }
                else map1.put(x,1);
            }
        }
        for(Integer x : ds2){
            String check = x+"";
            if(soKhongGiam(check)){
                if(map2.containsKey(x)){
                    map2.put(x , map2.get(x) + 1);
                }
                else map2.put(x,1);
            }
        }
        Set <Integer> set = map1.keySet();
        for(Integer x : set){
            if(map2.containsKey(x)){
                System.out.println(x +" "+map1.get(x) +" "+map2.get(x));
            }
        }
    }
}
