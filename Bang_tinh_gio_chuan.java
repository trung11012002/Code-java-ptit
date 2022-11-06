/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class MonHoc{
    private String maMonHoc , tenMonHoc;

    public MonHoc(String maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }
    
}
class GiangVien{
    private String maGiangVien , tenGiangVien;

    public GiangVien(String maGiangVien, String tenGiangVien) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
    }
}
class LopHocPhan{
    private String ma1 , ma2;
    private float gioChuan;
    private MonHoc tmp1;
    private GiangVien tmp2;

    public LopHocPhan(String ma1, String ma2, float gioChuan, MonHoc tmp1, GiangVien tmp2) {
        this.ma1 = ma1;
        this.ma2 = ma2;
        this.gioChuan = gioChuan;
        this.tmp1 = tmp1;
        this.tmp2 = tmp2;
    }

    @Override
    public String toString() {
        return  tmp2.getClass().
    }
    
}
public class Bang_tinh_gio_chuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String ,MonHoc> map1 = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String ma = s.substring(0,7);
            String ten = s.substring(8);
            MonHoc sv = new MonHoc(ma , ten);
            map1.put(ma , sv);
        }
        int m =Integer.parseInt(sc.nextLine());
        Map<String , GiangVien> map2 = new HashMap<>();
        for(int i=0;i<m;i++){
            String s = sc.nextLine();
            String ma = s.substring(0,4);
            String ten = s.substring(5);
            GiangVien sv = new GiangVien(ma,ten);
            map2.put(ma ,sv);
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i=0;i<k;i++){
            String ma1 = sc.next();
            String ma2 =sc.next();
            float gio = sc.nextFloat();
            LopHocPhan sv = new LopHocPhan(ma1,ma2,gio ,map1.get(ma2) ,map2.get(ma1));
            
        }
    }
}
