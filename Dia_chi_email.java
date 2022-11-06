/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Dia_chi_email {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            ArrayList<String> ds = new ArrayList<>();
            String s  = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                String x = st.nextToken().toLowerCase();
                ds.add(x);
            }
            String kq = ds.get(ds.size()-1);
            for(int j=0;j<ds.size()-1;j++){
                char z = ds.get(j).charAt(0);
                kq = kq + z;
            }
            if(map.containsKey(kq)){
                map.put(kq, map.get(kq) + 1);
            }
            else map.put(kq , 1);
            if(map.get(kq) == 1){
                System.out.println(kq + "@ptit.edu.vn");
            }
            else System.out.println(kq + map.get(kq) + "@ptit.edu.vn");
        }
    }
}
