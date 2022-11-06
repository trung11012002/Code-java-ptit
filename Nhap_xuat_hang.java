/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class NhapHang{
    private String ma , ten ,xepLoai;
    public NhapHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getXepLoai() {
        return xepLoai;
    }
    
}
class ThongKe{
    private String ma;
    private int soLuongNhap , donGiaNhap , soLuongXuat;
    private NhapHang tmp;
   
    public ThongKe(String ma, int soLuongNhap, int donGiaNhap, int soLuongXuat , NhapHang tmp) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
        this.tmp = tmp;
    }
    public String getMa() {
        return ma;
    }
    private int tongTriGiaXuat(){
        if(tmp.getXepLoai().equals("A")){
            return soLuongXuat*donGiaNhap*108/100;
        }
        else if(tmp.getXepLoai().equals("B")){
            return soLuongXuat*donGiaNhap*105/100;
        }
        else return soLuongXuat*donGiaNhap*102/100;
    }
    @Override
    public String toString() {
        return ma + " "+ tmp.getTen() + " " + soLuongNhap*donGiaNhap +" "+ tongTriGiaXuat();
    }
    
}
public class Nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThongKe> ds = new ArrayList<ThongKe>();
        Map<String,NhapHang> map = new HashMap<>();
        for(int i=0;i<n;i++){
            NhapHang sv = new NhapHang(sc.nextLine() , sc.nextLine(),
            sc.nextLine());
            map.put(sv.getMa() , sv);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++){
            String ma = sc.next();
            ThongKe sv = new ThongKe(ma ,sc.nextInt(),sc.nextInt(),
            sc.nextInt(),map.get(ma));
            ds.add(sv);
        }
        for(ThongKe x : ds){
            System.out.println(x);
        }
    }
}
