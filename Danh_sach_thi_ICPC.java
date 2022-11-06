/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

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
class SoTeam {
    private String maTeam;
    private String tenTeam,tenTruong;
    private static int cnt =1;
    public SoTeam(String tenTeam, String tenTruong) {
        this.maTeam = String.format("Team%02d", cnt++);
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public String getTenTeam() {
        return tenTeam;
    }

    public String getTenTruong() {
        return tenTruong;
    }
    
}
class ThiSinh implements Comparable<ThiSinh>{
    private String maThiSinh , tenThiSinh , maTeam;
    private SoTeam tmp;
    private static int cnt =1;
    public ThiSinh(String tenThiSinh, String maTeam, SoTeam tmp) {
        this.maThiSinh = String.format("C%03d", cnt++);
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.maTeam = maTeam;
        this.tmp = tmp;
    }

    @Override
    public String toString() {
        return  maThiSinh + " " + tenThiSinh + " " + tmp.getTenTeam() +" "+tmp.getTenTruong();
    }
    @Override
    public int compareTo(ThiSinh o){
        if(this.tenThiSinh.compareTo(o.tenThiSinh) > 0){
            return 1;
        }
        return -1;
    }
}
public class Danh_sach_thi_ICPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map <String , SoTeam> map = new HashMap<>();
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            SoTeam sv = new SoTeam(sc.nextLine(), sc.nextLine());
            map.put(sv.getMaTeam(), sv);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            
            ThiSinh sv = new ThiSinh(ten,ma,map.get(ma));
            ds.add(sv);
        }
        Collections.sort(ds);
        for(ThiSinh xxx : ds){
            System.out.println(xxx);
        }
    }
}
