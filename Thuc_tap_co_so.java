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
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SinhVien{
    private String masv , hoTen , soPhone , email;

    public SinhVien(String masv, String hoTen, String soPhone, String email) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.soPhone = soPhone;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoPhone() {
        return soPhone;
    }

    public String getEmail() {
        return email;
    }
    
}
class DeTai{
    private String maDeTai , tenQiangVien , tenDeTai;
    private static int cnt =1;
    public DeTai( String tenQiangVien, String tenDeTai) {
        this.maDeTai = String.format("DT%03d", cnt++);
        this.tenQiangVien = tenQiangVien;
        this.tenDeTai = tenDeTai;
    }

    public String getMaDeTai() {
        return maDeTai;
    }

    public String getTenQiangVien() {
        return tenQiangVien;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }
    
}
class NhiemVu implements Comparable<NhiemVu>{
    private String masv , madetai;
    private String hoidong;
    private SinhVien tmp1;
    private DeTai tmp2;
    public NhiemVu(String masv, String madetai ,String hoidong, SinhVien tmp1 , DeTai tmp2) {
        this.masv = masv;
        this.madetai = madetai;
        this.hoidong = hoidong;
        this.tmp1 = tmp1;
        this.tmp2 = tmp2;
    }

    @Override
    public String toString() {
        String s =tmp1.getMasv() +" "+tmp1.getHoTen() ;
        s = s  +" "+tmp2.getTenDeTai()+" "+tmp2.getTenQiangVien();
        return s;
    }
    @Override
    public int compareTo(NhiemVu o){
        if(this.tmp1.getMasv().compareTo(o.tmp1.getMasv()) > 0){
            return 1;
        }   
        return -1;
    }
}
public class Thuc_tap_co_so {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String , SinhVien> map1 = new HashMap<>();
        for(int i=0;i<n;i++){
            String ma = sc.nextLine();
            SinhVien sv = new SinhVien(ma, sc.nextLine() , sc.nextLine() , sc.nextLine());
            map1.put(ma,sv);
        }
        sc = new Scanner(new File("DETAI.in"));
        int m = Integer.parseInt(sc.nextLine());
        Map<String , DeTai> map2 = new HashMap<>();
        for(int i=0;i<m;i++){
            DeTai sv = new DeTai(sc.nextLine() , sc.nextLine());
            map2.put(sv.getMaDeTai(), sv);
        }
        sc = new Scanner(new File("HOIDONG.in"));
        int e =Integer.parseInt(sc.nextLine());
        ArrayList<NhiemVu> ds = new ArrayList<>();
        for(int i=0;i<e;i++){
            String ma1=sc.next();
            String ma2 =sc.next();
            String hoidong = sc.next();
            NhiemVu sv = new NhiemVu(ma1 , ma2, hoidong , map1.get(ma1) ,map2.get(ma2));
            ds.add(sv);
        }
        Collections.sort(ds);
        int ok=1;
        for(NhiemVu xxx : ds){
            System.out.printf("DANH SACH HOI DONG %d:\n" , ok++);
            System.out.println(xxx);
        }
    }
}
