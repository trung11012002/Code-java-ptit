/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
class DaThuc{
    private Map <Integer,Integer> map = new TreeMap<Integer,Integer>();
    
    public DaThuc(String s) {
        StringTokenizer st = new StringTokenizer(s);
        List <String> ds = new ArrayList<>();
        while(st.hasMoreTokens()){
            String zz = st.nextToken();
            ds.add(zz);
        }
        for(String x : ds){
            if(!x.equals("+")){
                int kk  = x.indexOf('*');
                String s1 = x.substring(0 , kk);
                int k = x.indexOf('^');
                String s2  = x.substring(k+1);
                int zz = Integer.parseInt(s2);
                int z = Integer.parseInt(s1);
                this.map.put(zz , z);
            }
        }
    }
    public DaThuc(){
        
    }
    public DaThuc cong(DaThuc o){
        DaThuc tmp =  new DaThuc();
        Set <Integer> set = this.map.keySet();
        Set <Integer> set2 = o.map.keySet();
        for(Integer x : set){
            if(o.map.containsKey(x)){
                tmp.map.put(x,this.map.get(x) + o.map.get(x));
            }
            else tmp.map.put(x, this.map.get(x));
        }
        for(Integer x : set2){
            if(!this.map.containsKey(x)){
                tmp.map.put(x , o.map.get(x));
            }
        }
        return tmp;
    }
    @Override
    public String toString() {
        Set <Integer> set = this.map.keySet();
        List <Integer> arr = new ArrayList<>();
        arr.addAll(set);
        Collections.sort(arr , (o1,o2) -> o2.compareTo(o1));
        String s = "";
        for(int i = 0;i<arr.size()-1;i++){
            int x = arr.get(i);
            s += (this.map.get(x)+"*x^" + x +" + ");
        }
        s+=(map.get(arr.get(arr.size()-1)) + "*x^" + arr.get(arr.size()-1));
        
        return s;
    }
    
}
public class Tong_da_Thuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
