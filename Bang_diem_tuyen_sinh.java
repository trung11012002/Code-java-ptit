/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

/**
 *
 * @author admin
 */
import java.text.ParseException;
import java.util.*;
import java.util.Arrays;
class Tuyen_sinh implements Comparable<Tuyen_sinh>{
    private String ma;
    private String ten;
    private double toan;
    private double ly;
    private double hoa;
    private String diem_uu_tien;
    private double tong1;
    private String tong11;
    private double tong2;
    private String xet_duyet;
    public Tuyen_sinh(String ma, String ten, double toan, double ly, double hoa) throws ParseException{
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.tong1 = this.toan*2 + this.ly + this.hoa;
        
        String s = this.ma.substring(0, 3);
        this.tong2 = this.tong1;     
        if(s.compareTo("KV1") == 0){
            this.tong2 +=0.5;
            this.diem_uu_tien = "0.5";
        }
        if(s.compareTo("KV2") == 0){
            this.tong2 +=1.0;
            this.diem_uu_tien = "1";
        }
        if(s.compareTo("KV3") == 0){
            this.tong2 +=2.5;
            this.diem_uu_tien = "2.5";
        }
        if(this.tong2 >= 24){
            this.xet_duyet = "TRUNG TUYEN";
        }
        if(this.tong2 < 24){
            this.xet_duyet = "TRUOT";
        }
        String z = this.tong2+"";
        if(z.charAt(z.length()-1) == '0' && z.charAt(z.length()-2) == '.'){
            this.tong11 = z.substring(0, z.length() - 2);
        }
        else {
            this.tong11 = z;
        }
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + diem_uu_tien + " " + tong11 +" " + xet_duyet ;
    }
    @Override
    public int compareTo(Tuyen_sinh o){
        if(this.tong2 < o.tong2){
            return 1;
        }
        if(this.tong2 == o.tong2 && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Bang_diem_tuyen_sinh {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.nextLine());
        ArrayList<Tuyen_sinh> ds = new ArrayList<Tuyen_sinh>();
        
        for(int i=0;i<n;i++){
            Tuyen_sinh sv = new Tuyen_sinh(sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Tuyen_sinh xxx : ds){
            System.out.println(xxx);
        }
        
    }
}
