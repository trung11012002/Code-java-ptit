/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class XepLoai implements Comparable<XepLoai>{
    private String ma;
    private String ten;
    private float a , b , c;
    private static int cnt =1;
    public XepLoai(String ten, float a, float b, float c) {
        this.ma = String.format("SV%02d", cnt++);
        this.ten = ten;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private float diemTongKet(){
        float tmp = this.a*25/100 + this.b*35/100 +this.c*40/100;
        return tmp;
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
    private String xepLoai(){
        float tmp = (float)Math.round(this.diemTongKet() * 100) /100;
        if(tmp >= 8) return "GIOI";
        else if(tmp >= 6.5 && tmp < 8) return "KHA";
        else if(tmp >= 5 && tmp < 6.5) return "TRUNG BINH";
        else return "KEM";
    }

    @Override
    public String toString() {
        return  ma + " " + chuan_hoa_ho_ten() + " "+ String.format("%.2f",this.diemTongKet()) +" "+
                this.xepLoai();
    }
    @Override
    public int compareTo(XepLoai o){
        if(this.diemTongKet() < o.diemTongKet()){
            return 1;
        }
        return -1;
    }
}
public class Xep_loai {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<XepLoai> ds = new ArrayList<XepLoai>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            XepLoai sv = new XepLoai(sc.nextLine() ,Float.parseFloat(sc.nextLine()),
            Float.parseFloat(sc.nextLine()) , Float.parseFloat(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(XepLoai xxx : ds){
            System.out.println(xxx);
        }
    }
}
