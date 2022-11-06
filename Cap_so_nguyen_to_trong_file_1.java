/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class Cap_so_nguyen_to_trong_file_1 {
    public static boolean ng_to(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) sc1.readObject();
        ObjectInputStream sc2 =  new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds2 = (ArrayList<Integer>) sc2.readObject();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for(Integer x : ds1){
            if(ng_to(x)){
                set1.add(x);
            }
        }
        for(Integer x : ds2){
            if(ng_to(x)){
                set2.add(x);
            }
        }
        for(Integer x : set1){
            int k = 1000000-x;
            if(set1.contains(k)){
                if(!set2.contains(x) && !set2.contains(k) && x <k){
     
                    map.put(x,k);
                }
            }
        }
        Set<Integer> set = new TreeSet<>();
        set = map.keySet();
        for(Integer x : set){
            System.out.println(x + " "+ map.get(x));
        }
    }
}
