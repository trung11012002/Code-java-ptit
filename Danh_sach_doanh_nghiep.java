/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author admin
 */
class DN implements Comparable<DN>{
    private String ma;
    private String ten;
    private int so_luong;

    public DN(String ma, String ten, int so_luong) {
        this.ma = ma;
        this.ten = ten;
        this.so_luong = so_luong;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + so_luong;
    }
    @Override
    public int compareTo(DN o){
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_doanh_nghiep {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DN.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DN> ds = new ArrayList<DN>();
        for(int i=0;i<n;i++){
            DN sv = new DN(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(DN xxx : ds){
            System.out.println(xxx);
        }
    }
}
