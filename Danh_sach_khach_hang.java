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

/**
 *
 * @author admin
 */
class KhachHang implements Comparable<KhachHang>{
    private String ma , ten , gioiTinh ;
    private Date ngaySinh;
    private String diaChi;
    private static int cnt =1;
    public KhachHang( String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = String.format("KH%03d",cnt++);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
    }
    private String chuan_hoa_ho_ten(){
        String s = this.ten.toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        String z="";
        ArrayList<String> nn = new ArrayList<String>();
        while(st.hasMoreTokens()){
            String zz = st.nextToken();
            zz = zz.substring(0,1).toUpperCase() + zz.substring(1);
            nn.add(zz);
        }
        z = nn.get(0);
        for(int i=1;i<nn.size();i++){
            z = z + " " + nn.get(i);
        }
        return z;
    }

    @Override
    public String toString() {
        return ma + " " + chuan_hoa_ho_ten() + " " + gioiTinh + " " + diaChi + " " + 
                new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh);
    }
    @Override
    public int compareTo(KhachHang o){
        if(this.ngaySinh.compareTo(o.ngaySinh) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_khach_hang {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        int n =  Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            KhachHang sv = new KhachHang(sc.nextLine(), sc.nextLine(),
            sc.nextLine() , sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(KhachHang xxx : ds){
            System.out.println(xxx);
        }
    }
}
