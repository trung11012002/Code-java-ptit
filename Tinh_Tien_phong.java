/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class Phong implements Comparable<Phong>{
    private String ma;
    private String ten;
    private String so_phong;
    private Date den;
    private Date di;
    private int them;
    private static int cnt =1;
    public Phong(String ten, String so_phong, String den, String di, int them) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.so_phong = so_phong;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
        this.them = them;
    }
    private long cnt_ngay(){
        long valuetime  = Math.abs(this.di.getTime() - this.den.getTime());
        return (valuetime / (1000*60*60*24)) + 1;
    }
    private String Chuan_hoa_ho_ten(){
        StringTokenizer st = new StringTokenizer(this.ten);
        String z="";
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            s = s.toLowerCase();
            s = s.substring(0,1).toUpperCase() + s.substring(1);
            z = z + " " +s;
        }
        return z;
    }
    private long Tong_tien(){
        if(this.so_phong.charAt(0) == '1'){
            return this.cnt_ngay()*25+this.them;
        }
        else if(this.so_phong.charAt(0) == '2'){
            return this.cnt_ngay()*34 +this.them;
        }
        else if(this.so_phong.charAt(0) == '3'){
            return this.cnt_ngay()*50 + this.them;
        }
        else return this.cnt_ngay()*80+this.them;
        }

    @Override
    public String toString() {
        return  ma + " " + Chuan_hoa_ho_ten()+ " "+ so_phong +" "+ this.cnt_ngay()+" "+ this.Tong_tien();
    }
    @Override
    public int compareTo(Phong o){
        if(this.Tong_tien() < o.Tong_tien()){
            return 1;
        }
        return -1;
    }
}
public class Tinh_Tien_phong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file = new File("KHACHHANG.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Phong> ds = new ArrayList<Phong>();
        for(int i=0;i<n;i++){
            Phong sv = new Phong(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Phong xxx : ds){
            System.out.println(xxx);
        }
    }
}