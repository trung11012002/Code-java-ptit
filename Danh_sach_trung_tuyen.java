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
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class ThiSinh implements Comparable<ThiSinh>{
    private String ma;
    private String ten;
    private float a , b , c;

    public ThiSinh(String ma, String ten, float a, float b, float c) {
        this.ma = ma;
        this.ten = ten;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private String Diem_uu_tien(){
        String s = this.ma.substring(0,3);
        if(s.compareTo("KV1") == 0){
            return "0.5";
        }
        else if(s.compareTo("KV2") == 0){
            return "1";
        }
        else return "2.5";
    }
    public float diem_chuan(){
        float sum = this.a*2+this.b+this.c;
        String s = this.ma.substring(0,3);
        if(s.compareTo("KV1") == 0){
            return (float) (sum+0.5);
        }
        else if(s.compareTo("KV2") == 0){
            return (float) (sum+1.0);
        }
        else return (float)(sum + 2.5);
     
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
    private String Chuan_hoa_diem_chuan(){
        String s = this.diem_chuan() +"";
        if(s.charAt(s.length() - 1)  == '0' && s.charAt(s.length()-2) == '.'){
            s = s.substring(0,s.length()-2);
        }
        return s;
    }
    @Override
    public String toString() {
        return  ma + " " + Chuan_hoa_ho_ten() + " " + this.Diem_uu_tien() +" " +this.Chuan_hoa_diem_chuan() +" ";    
    }
    @Override
    public int compareTo(ThiSinh o){
        if(this.diem_chuan() < o.diem_chuan()){
            return 1;
        }
        if(this.diem_chuan() == o.diem_chuan() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_trung_tuyen {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("THISINH.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        int k = n;
        ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
        while(n-->0){
            ThiSinh sv = new ThiSinh(sc.nextLine() ,sc.nextLine() , Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            ds.add(sv);        
        }
        int t = Integer.parseInt(sc.nextLine());
        int vt;
        Collections.sort(ds);
        System.out.println(ds.get(t-1).diem_chuan());
        for(int i=0;i<k;i++){
            if(ds.get(i).diem_chuan() >= ds.get(t-1).diem_chuan()){
                System.out.println(ds.get(i) + "TRUNG TUYEN");
            }
            else {
                 System.out.println(ds.get(i) + "TRUOT");
            }
        }
    }
}
