/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String ten;
    private String lop;
    private String email;
    
    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ChuanHoaTen(ten);
        this.lop = lop;
        this.email = email;
    }
    private String ChuanHoaTen(String s){
        s = s.toLowerCase();
        String z = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String zz = st.nextToken();
            z += (zz.substring(0 , 1).toUpperCase() + zz.substring(1) + " ");
        }
        return z;
    }
    @Override
    public String toString() {
        return ma + " " + ten + lop +  " " + email ;
    }
    @Override
    public int compareTo(SinhVien o){
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_sinh_vien_trong_file_2 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file = new File("SINHVIEN.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        for(int i=0;i<n;i++){
            SinhVien sv = new SinhVien(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(SinhVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
