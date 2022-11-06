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
class Online implements Comparable<Online>{
    private String ten;
    private Date ngayBD , gioBD , ngayKT ,gioKT;

    public Online(String ten, String ngayBD,String gioBD,String ngayKT,String gioKT) throws ParseException {
        this.ten = ten;
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss");
        this.ngayBD = df1.parse(ngayBD);
        this.gioBD = df2.parse(gioBD);
        this.ngayKT = df1.parse(ngayKT);
        this.gioKT = df2.parse(gioKT);
    }
    private long phutOnl(){
        long tmp = Math.abs(this.ngayKT.getTime()+this.gioKT.getTime()-(this.ngayBD.getTime()+this.gioBD.getTime()));
        tmp /=(1000*60);
        return tmp;
    }
//    private String tenSS(){
//        String s= "";
//        ArrayList<String> ds = new ArrayList<String>();
//        StringTokenizer st =new StringTokenizer(this.ten);
//        while(st.hasMoreTokens()){
//            ds.add(st.nextToken());
//        }
//        s = ds.get(ds.size()-1);
//        for(int i=0;i<ds.size()-1;i++){
//            s = s + " " + ds.get(i);
//        }
//        return s;
//    }
    private long phutOnl1(){
           long tmp = Math.abs(this.ngayKT.getTime()+this.gioKT.getTime()-(this.ngayBD.getTime()+this.gioBD.getTime()));
           return tmp;
       }
    @Override
    public String toString() {
        return  ten + " " +phutOnl();
    }
    @Override
    public int compareTo(Online o){
        if(this.phutOnl1() < o.phutOnl1()){
            return 1;
        }
        if(this.phutOnl1() == o.phutOnl1() && this.ten.compareTo(o.ten) > 0){
            return 1;
        }
        return -1;
    }
}
public class Thoi_gian_online_lien_tuc {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Online> ds = new ArrayList<Online>();
        for(int i=0;i<n;i++){
            Online sv = new Online(sc.nextLine(),sc.next(),sc.next(),
            sc.next(),sc.next());
            sc.nextLine();
            ds.add(sv);
        }
        Collections.sort(ds);
        for(Online xxx : ds){
            System.out.println(xxx);
        }
    }
}
