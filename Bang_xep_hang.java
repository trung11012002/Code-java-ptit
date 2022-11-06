/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.text.ParseException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Comparator;
import java.text.*;
import java.util.Collections;
import java.util.Arrays;
/**
 *
 * @author admin
 */
class Bang implements Comparable<Bang>{
    private String ten;
    private long a;
    private long b;
    public Bang(String ten, String c) throws ParseException{
        this.ten = ten;
        StringTokenizer st = new StringTokenizer(c);
        int ll = 1;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            if(ll == 1){
                this.a = Long.valueOf(s);
            }
            if(ll == 2){
                this.b = Long.valueOf(s);
            }
            ll++;
        }
    }
    @Override
    public String toString() {
        return ten + " " + a + " " + b ;
    }
    @Override
    public int compareTo(Bang o){
        if(this.a < o.a){
            return 1;
        }   
        if(this.a == o.a && this.b > o.b){
            return 1;
        }
        if(this.a == o.a && this.b == o.b && this.ten.compareTo(o.ten) > 0){
            return 1;
        }
        return -1;
    }
}
public class Bang_xep_hang {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList <Bang> ds = new ArrayList<Bang>();
        for(int i=0;i<n;i++){
            Bang sv = new Bang(sc.nextLine() , sc.nextLine());  
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Bang xxx : ds){
            System.out.println(xxx);
        }
    }
}
