
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_hop_code_ptitt;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author User
 */
class Pair implements Serializable, Comparable<Pair>{
    private int first, second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int getFirst(){
        return first;
    }
    public int getSecond(){
        return second;
    }
    public int compareTo(Pair o){
        return this.first - o.first;
    }

    @Override
    public String toString() {
        return "("+ first + ", " + second + ')';
    }
    
}
public class liet_ke_cap_so_1{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arr = (ArrayList<Pair>)(in.readObject());
        ArrayList<Pair> res = new ArrayList<>();
        HashSet<String> se = new HashSet<>();
        for(Pair x : arr){
            if(x.getFirst() >= x.getSecond()) continue;
            String tmp = x.getFirst() + " " + x.getSecond();
            if(!se.contains(tmp)){
                se.add(tmp);
                res.add(x);
            }
        }
        Collections.sort(res);
        for(Pair x : res)
            System.out.println(x);
    }
}