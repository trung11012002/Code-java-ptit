/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.math.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
/**
 *
 * @author admin
 */
class Sx_Gio implements Comparable<Sx_Gio>{
    private String ma;
    private String ten;
    private Date gio_vao;
    private Date gio_ra;
    private String time_play_gio;
    private String time_play_phut;
    private long giay;
    public Sx_Gio(String ma, String ten, String gio_vao, String gio_ra) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gio_vao = new SimpleDateFormat("HH:mm").parse(gio_vao);
        this.gio_ra = new SimpleDateFormat("HH:mm").parse(gio_ra);
        long valuevao = this.gio_vao.getTime();
        long valuera = this.gio_ra.getTime();
        long tmp = Math.abs(valuera - valuevao);
        long secs = tmp/1000;
        this.giay = secs;
        this.time_play_gio = (secs/3600 +"");
        this.time_play_phut = (secs%3600/60) +"";
    }
    @Override
    public String toString() {
        return ma + " " + ten +" " +time_play_gio +" gio " +time_play_phut +" phut";
    }
    @Override
    public int compareTo(Sx_Gio o){
        if(this.giay < o.giay){
            return 1;
        }
        
        return -1;
    }
}
// String.format("%02d:%02d:%02d", secs / 3600, (secs % 3600) / 60, (secs % 60));
public class Tinh_gio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sx_Gio> ds = new ArrayList<Sx_Gio>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            Sx_Gio sv = new Sx_Gio(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Sx_Gio xxx : ds){
            System.out.println(xxx);
        }
    }
}
