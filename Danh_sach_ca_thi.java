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
class CaThi implements Comparable<CaThi>{
    private String ma;
    private Date ngay;
    private Date gio;
    private String phong;
    private static int cnt =1;
    public CaThi(String ngay, String gio, String phong) throws ParseException {
        this.ma = String.format("C%03d", cnt++);
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);
        this.phong = phong;
    }

    @Override
    public String toString() {
        return  ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + new SimpleDateFormat("HH:mm").format(gio) + " " + phong ;
    }
    @Override
    public int compareTo(CaThi o){
        if(this.ngay.compareTo(o.ngay) > 0){
            return 1;
        }
        if(this.ngay.compareTo(o.ngay) == 0 && this.gio.compareTo(o.gio) > 0){
            return 1;
        }
        if(this.ngay.compareTo(o.ngay) == 0 && this.gio.compareTo(o.gio) == 0 && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_ca_thi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ds = new ArrayList<CaThi>();
        for(int i=0;i<n;i++){
            CaThi sv = new CaThi( sc.nextLine() , sc.nextLine(),sc.nextLine());
            ds.add(sv);           
        }
        Collections.sort(ds);
        for(CaThi xxx : ds){
            System.out.println(xxx);
        }
    }
}
