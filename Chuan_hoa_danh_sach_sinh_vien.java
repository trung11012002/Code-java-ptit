/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author admin
 */
class SinhVien{
    private String ma,ten,lop;
    private Date ngaySinh;
    private float GPA;
    private static int cnt=1;
    public SinhVien(String ten, String lop, String ngaySinh, float GPA) throws ParseException {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.GPA = GPA;
    }
    private String chuan_hoa_ho_ten(){
        String s = this.ten.toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        String z="";
        ArrayList<String> nn = new ArrayList<String>();
        while(st.hasMoreTokens()){
            String zz = st.nextToken();
            zz = zz.substring(0,1).toUpperCase() + zz.substring(1);
            nn.add(zz);
        }
        z = nn.get(0);
        for(int i=1;i<nn.size();i++){
            z = z + " " + nn.get(i);
        }
        return z;
    }

    @Override
    public String toString() {
        return  ma + " " + chuan_hoa_ho_ten() + " " + lop + " " + 
        new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", GPA);
    }
    
}
public class Chuan_hoa_danh_sach_sinh_vien {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        for(int i=0;i<n;i++){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(),
            sc.nextLine() , Float.parseFloat(sc.nextLine()));
            ds.add(sv);
        }
        for(SinhVien xxx : ds){
            System.out.println(xxx);
        }
    }
}
