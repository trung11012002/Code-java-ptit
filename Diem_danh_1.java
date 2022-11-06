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
class SinhVien{
    private String ma;
    private String ten;
    private String lop;
    private int diem;
    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString() {
        if(this.diem > 0) {
            return ma + " " + ten + " " + lop + " " + diem ;
        }
        else {
            return ma + " " + ten + " " + lop + " " + diem +" " + "KDDK";
        }
    }
    
}
public class Diem_danh_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        for(int i =0;i<n;i++){
            SinhVien sv = new SinhVien(sc.nextLine() , sc.nextLine(),sc.nextLine());
            ds.add(sv);
        }
        Map <String , Integer> map = new HashMap<String,Integer>();
        int tmp;
        for(int i=0;i<n;i++){
            tmp = 10;
            String z = sc.next();
            String zz = sc.next();
            for(int j = 0;j < zz.length() ;j++){
                if(zz.charAt(j) == 'v'){
                    tmp -=2;
                }
                if(zz.charAt(j) == 'm'){
                    tmp -= 1;
                }
                if(tmp <= 0){
                    tmp = 0;
                    break;
                }
            }
            map.put(z, tmp);
        }
        for(SinhVien xxx : ds){
            String tu_khoa = xxx.getMa();
            xxx.setDiem(map.get(tu_khoa));
        }
        String lop_can_liet_ke = sc.next();
        for(SinhVien xxx : ds){          
            String lop_can_in = xxx.getLop();
            if(lop_can_in.compareTo(lop_can_liet_ke) == 0){
                System.out.println(xxx);
            }
        }
    }
}
