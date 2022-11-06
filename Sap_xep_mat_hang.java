/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MatHang implements Comparable<MatHang>{
    private String ma;
    private String ten;
    private String nhom;
    private float mua;
    private float ban;
    private static int cnt =1;
    public MatHang(String ten, String nhom, float mua, float ban) {
        this.ma = String.format("MH%02d" , cnt ++);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    private float loi_nhuan() {
        return this.ban - this.mua;
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + nhom + " " + String.format("%.2f", loi_nhuan()) ;
    }
    @Override
    public int compareTo(MatHang o){
        if(this.loi_nhuan() < o.loi_nhuan()){
            return 1;
        }
        if(this.loi_nhuan() == o.loi_nhuan() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Sap_xep_mat_hang {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MATHANG.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        ArrayList<MatHang> ds = new ArrayList<MatHang>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            MatHang sv = new MatHang(sc.nextLine() , sc.nextLine() ,Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(MatHang xxx : ds){
            System.out.println(xxx);
        }
    }
}
