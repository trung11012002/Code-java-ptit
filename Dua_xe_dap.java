/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
class DuaXe implements Comparable<DuaXe>{
    private String ma,ten , donVi;
    private Date denDich;
    public DuaXe(String ten, String donVi, String denDich) throws ParseException {
        this.ten = ten;
        this.donVi = donVi;
        this.denDich = new SimpleDateFormat("HH:mm").parse(denDich);
    }
    private String chuanHoaMa(){
        String s = "";
        StringTokenizer st1 = new StringTokenizer(this.donVi);
        StringTokenizer st2 = new StringTokenizer(this.ten);
        while(st1.hasMoreTokens()){
            String z = st1.nextToken();
            s = s + z.charAt(0);
        }
        while(st2.hasMoreTokens()){
            String z = st2.nextToken();
            s = s + z.charAt(0);
        }
        return s;
    }
    private double vanToc() throws ParseException{
        Date dich = new SimpleDateFormat("HH:mm").parse("6:00");
        double tmp = Math.abs(this.denDich.getTime()-dich.getTime());
        tmp/=1000;
        tmp/=(60*60);
        return (double)120/tmp;
    }

    @Override
    public String toString() {
        try {
            return chuanHoaMa() + " " + ten + " " + donVi + " " +String.format("%.0f",vanToc()) +" Km/h";
        } catch (ParseException ex) {
            Logger.getLogger(DuaXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public int compareTo(DuaXe o){
        try {
            if(this.vanToc() < o.vanToc()){
                return 1;
            }
        } catch (ParseException ex) {
            Logger.getLogger(DuaXe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
public class Dua_xe_dap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<DuaXe> ds = new ArrayList<DuaXe>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            DuaXe sv = new DuaXe(sc.nextLine(),sc.nextLine(),
            sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(DuaXe xxx : ds){
            System.out.println(xxx);
        }
    }
}
