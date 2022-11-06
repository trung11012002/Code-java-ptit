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
import java.util.List;


/**
 *
 * @author admin
 */
public class So_thuan_nghich_trong_File {
    public static boolean thuan_nghich(String s){
        for(int i=0;i<s.length();i++){
            if((int)(s.charAt(i)-'0') % 2 ==0) return false;
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc= new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) sc.readObject();
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) sc.readObject();     
        int [] a = new int [1000005];
        int [] b = new int [1000005];
        for(Integer x : list1){
            String z = x + "";
            if(z.length() > 1 && z.length() % 2 ==1){
                if(thuan_nghich(z)){
                    a[x]++;
                }
            }           
        }
        for(Integer x :list2){
            String z = x + "";
            if(z.length() > 1 && z.length() % 2 ==1 ){
                if(thuan_nghich(z)){
                   b[x]++;
                }
            }           
        }
        int ok =0;
        for(int i = 0 ; i< 1000005 ;i++){
            if(a[i] >= 1 && b[i] >= 1 && ok < 10){
                int k = a[i] + b[i];
                System.out.println(i + " " + k);
                ok++;
            }
            if(ok >= 10) break;
        }
    }
}
