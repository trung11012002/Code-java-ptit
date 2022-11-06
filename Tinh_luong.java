/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class PhongBan{
    private String maPhong,tenPhong;
    public PhongBan(String maPhong, String tenPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
    
}
class NhanVien{
    private String ma , ten;
    private long luongCB , soNgayCong;
    private PhongBan tmpp;

    public NhanVien(String ma, String ten, long luongCB, long soNgayCong, PhongBan tmpp) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.tmpp = tmpp;
    }
    public String getMa() {
        return ma;
    }
    private long He_so_nhan(){
        char z = this.ma.charAt(0);
        String s = this.ma.substring(1, 3);
        int tmp = 0;
        for(int i=0;i<s.length();i++){
            tmp = tmp*10 + (s.charAt(i)-'0'); 
        }
        if(z == 'A'){
            if(tmp >=16) return 20;
            else if(tmp >= 9) return 14;
            else if(tmp >= 4) return 12;
            else return 10;
        }
        if(z == 'B'){
           if(tmp >=16) return 16;
            else if(tmp >= 9) return 13;
            else if(tmp >= 4) return 11;
            else return 10; 
        }
        if(z == 'C'){
            if(tmp >=16) return 14;
            else if(tmp >= 9) return 12;
            else if(tmp >= 4) return 10;
            else return 9;
        }
        if(z=='D'){
            if(tmp >=16) return 13;
            else if(tmp >= 9) return 11;
            else if(tmp >= 4) return 9;
            else return 8;
        }
        return 0;
    }
    private long tongLuong(){
        return this.luongCB*soNgayCong*He_so_nhan()*1000;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " +tongLuong();
    }    
}
public class Tinh_luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        Map<String ,PhongBan> map = new HashMap<String , PhongBan>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            ArrayList<String> arr = new ArrayList<String>();
            while(st.hasMoreTokens()){
                arr.add(st.nextToken());
            }
            String z =arr.get(0);
            String zz =arr.get(1);
            for(int j=2; j < arr.size() ;j++){
                zz = zz + " " +arr.get(j);
            }
            PhongBan sv = new PhongBan(z , zz);
            map.put(z, sv);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++){
            String ma = sc.nextLine();
            NhanVien sv = new NhanVien(ma,sc.nextLine(),
            Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),
            map.get(ma.substring(3)));
            ds.add(sv);
        }
        String check = sc.nextLine();
        System.out.println("Bang luong phong " + map.get(check).getTenPhong() +":");
        for(NhanVien xxx : ds){
            String mm = xxx.getMa().substring(3);
            if(mm.equals(check)){
                System.out.println(xxx);
            }
        }
    }
}
