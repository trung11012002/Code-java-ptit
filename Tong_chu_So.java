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
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tong_chu_So {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds =  (ArrayList<String>) sc.readObject();
        for(String x : ds){
            int sum = 0;
            String s = "";
            for(int i=0;i<x.length();i++){
                if(x.charAt(i) >= '0' && x.charAt(i) <= '9'){
                    s+=(x.charAt(i)+"");
                }
            }
            while(s.charAt(0) == '0'){
                s = s.substring(1);
            }
            for(int i=0;i<s.length();i++){
                sum +=(int)(s.charAt(i)-'0');
            }
            System.out.println(s +" "+sum);
        }
    }
}
