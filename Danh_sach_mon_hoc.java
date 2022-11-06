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
class MonHoc implements Comparable<MonHoc>{
    private String ma;
    private String ten;
    private int so_tin_chi;

    public MonHoc(String ma, String ten, int so_tin_chi) {
        this.ma = ma;
        this.ten = ten;
        this.so_tin_chi = so_tin_chi;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + so_tin_chi;
    }
    @Override
    public int compareTo(MonHoc o){
        if(this.ten.compareTo(o.ten) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <MonHoc> ds = new ArrayList<MonHoc>();
        for(int i=0;i<n;i++){
            MonHoc sv = new MonHoc(sc.nextLine() , sc.nextLine() ,Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(MonHoc xxx : ds){
            System.out.println(xxx);
        }
    }
}
