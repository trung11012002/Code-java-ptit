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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
class VDV implements Comparable<VDV>{
    private String ma;
    private String ten;
    private Date ngay_sinh;
    private Date phat;
    private Date dich;
    private static int cnt =1;
    public VDV(String ten, String ngay_sinh, String phat, String dich) throws ParseException {
        this.ma = String.format("VDV%02d", cnt++);
        this.ten = ten;
        this.ngay_sinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_sinh);
        this.phat = new SimpleDateFormat("HH:mm:ss").parse(phat);
        this.dich = new SimpleDateFormat("HH:mm:ss").parse(dich);
    }
    private Date tuoi() throws ParseException{
        int tmp = 2021 - (1900 + this.ngay_sinh.getYear());
        if(tmp>=32){
            String s = String.format("%02d:%02d:%02d", 0 , 0 ,3);
            return new SimpleDateFormat("HH:mm:ss").parse(s);
        }
        else if(tmp>=25 && tmp < 32 ){
            String s = String.format("%02d:%02d:%02d", 0 , 0 ,2);
            return new SimpleDateFormat("HH:mm:ss").parse(s);
        }
        else if(tmp>=18 && tmp < 25 ){
            String s =  String.format("%02d:%02d:%02d", 0 , 0 ,1);
            return new SimpleDateFormat("HH:mm:ss").parse(s);
        }
        else {
           String s = String.format("%02d:%02d:%02d", 0 , 0 ,0);
            return new SimpleDateFormat("HH:mm:ss").parse(s);
        }
    }
    private Date time_run() throws ParseException{
        long tmp = Math.abs(this.dich.getTime() - this.phat.getTime());
        tmp=tmp/1000;
        String s = String.format("%02d:%02d:%02d", tmp/3600 , (tmp%3600) /60 ,(tmp%60));
        return new SimpleDateFormat("HH:mm:ss").parse(s);
    }
    public Date time_xep_hang() throws ParseException{
        long tmp = Math.abs(this.time_run().getTime() - this.tuoi().getTime());
        tmp=tmp/1000;
        String s =String.format("%02d:%02d:%02d", tmp/3600 , (tmp%3600) /60 ,(tmp%60));
        return new SimpleDateFormat("HH:mm:ss").parse(s);
    }
    @Override
    public String toString() {       
        try { 
            return ma+" "+ten + " " + new SimpleDateFormat("HH:mm:ss").format(time_run()) + " " + new SimpleDateFormat("HH:mm:ss").format(tuoi()) +" "
                    + new SimpleDateFormat("HH:mm:ss").format(time_xep_hang());
        } catch (ParseException ex) {
            Logger.getLogger(VDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public int compareTo(VDV o){
        try {
            if(this.time_xep_hang().compareTo(o.time_xep_hang()) > 0){
                return 1;
            }
        } catch (ParseException ex) {
            Logger.getLogger(VDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(this.time_xep_hang().compareTo(o.time_xep_hang()) == 0 && this.ma.compareTo(o.ma) > 0){
                return 1;
            }
        } catch (ParseException ex) {
            Logger.getLogger(VDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
public class Xep_hang_van_dong_vien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> ds = new ArrayList<VDV>();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<n;i++){
            VDV sv = new VDV(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            ds.add(sv);
            arr.add(sv.time_xep_hang().toString());
        }
        Collections.sort(arr,(o1,o2) -> o1.compareTo(o2));
        Collections.sort(ds);
        for(int i=0;i<n;i++){
            System.out.print(ds.get(i));
            for(int j = 0;j<n;j++){
                if(ds.get(i).time_xep_hang().toString().compareTo(arr.get(j)) == 0){
                    System.out.println(" " + (j+1));
                    break;
                }
            }
        }
    }
}
