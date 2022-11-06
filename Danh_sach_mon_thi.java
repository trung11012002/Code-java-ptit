/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MonThi implements Comparable<MonThi>{
    private String ma;
    private String ten;
    private String hinh_thuc;

    public MonThi(String ma, String ten, String hinh_thuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinh_thuc = hinh_thuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinh_thuc ;
    }
    @Override
    public int compareTo(MonThi o){
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_mon_thi {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonThi> ds = new ArrayList<MonThi>();
        for(int i=0;i<n;i++){
            MonThi sv = new MonThi(sc.nextLine() , sc.nextLine() , sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(MonThi xxx : ds){
            System.out.println(xxx);
        }
    }
}
