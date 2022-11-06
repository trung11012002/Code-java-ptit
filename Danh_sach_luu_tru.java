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

/**
 *
 * @author admin
 */
class Khach implements Comparable<Khach>{
    private String ma;
    private String ten;
    private String ma_phong;
    private Date in;
    private Date out;
    private long so_ngay;
    private static int cnt = 1;
    public Khach(String ten, String ma_phong, String in, String out) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.ma_phong = ma_phong;
        try{
            this.in = new SimpleDateFormat("dd/MM/yyyy").parse(in);
            this.out = new SimpleDateFormat("dd/MM/yyyy").parse(out);
            long valuein = this.in.getTime();
            long valueout = this.out.getTime();
            long tmp = Math.abs(valuein - valueout);
            long result = tmp/(24*60*60*1000);
            this.so_ngay = result;
        }catch(ParseException x){
            x.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + ma_phong + " " + so_ngay ;
    }
    @Override
    public int compareTo(Khach o){
        if(this.so_ngay < o.so_ngay){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_luu_tru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file = new File("KHACH.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> ds = new ArrayList<Khach>();
        for(int i=0;i<n;i++){
            Khach sv = new Khach(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Khach xxx : ds){
            System.out.println(xxx);
        }
    }
}
