/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class BTL implements Comparable<BTL>{
    private String ma;
    private String ten;
    private String phoneNumber;
    private int nhom;

    public BTL(String ma, String ten, String phoneNumber, int nhom) {
        this.ma = ma;
        this.ten = ten;
        this.phoneNumber = phoneNumber;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + phoneNumber +" " +nhom +" ";
    }
    @Override
    public int compareTo(BTL o){
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Quan_li_bai_tap_nhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<BTL> ds = new ArrayList<BTL>();
        for(int i=0;i<n;i++){
            BTL sv = new BTL(sc.nextLine() ,sc.nextLine() ,sc.nextLine(),
            Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Map<Integer , String> map = new HashMap<Integer , String>();
        int t = 1;
        for(int i=0;i<m;i++){
            map.put(t++, sc.nextLine());
        }
        Collections.sort(ds);
        for(BTL xxx : ds){
            System.out.println(xxx + map.get(xxx.getNhom()));
        }
    }
}
