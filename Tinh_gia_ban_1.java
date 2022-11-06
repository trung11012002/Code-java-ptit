/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  tong_hop_code_ptitt;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author User
 */
    class GiaBan implements Comparable<GiaBan>{
    private static int cnt = 1;
    private String maHang, tenHang, donViTinh;
    private int donGiaNhap, soLuong;

    public GiaBan(String tenHang, String donViTinh, int donGiaNhap, int soLuong) throws ParseException{
        this.maHang = "MH" + String.format("%02d", cnt++);
        this.tenHang = tenHang;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
    }
    
    public int phiVanChuyen(){
        return (int) Math.round((this.donGiaNhap * this.soLuong) / 100.0 * 5);
    }
    
    public int thanhTien(){
        return (int) Math.round(this.donGiaNhap * this.soLuong + this.phiVanChuyen());
    }
    
    public int giaBan(){
        return (int) Math.ceil(((this.thanhTien() + this.thanhTien()/100.0*2) / this.soLuong) / 100) *100;
    }
    @Override
    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.donViTinh + " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
                 
    }
    @Override
    public int compareTo(GiaBan o){
        if(this.giaBan() < o.giaBan()){
            return 1;
        }
        return -1;
    }
    }
    public  class Tinh_gia_ban_1{
        
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaBan> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            GiaBan tmp = new GiaBan(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(GiaBan xxx : arr){
            System.out.println(xxx);
        }
    }
    }