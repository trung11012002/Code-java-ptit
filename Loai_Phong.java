/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String ky_hieu;
    private String ten;
    private String don_gia;
    private String phi_phuc_vu;
    public LoaiPhong(String s) {
        String [] words = s.split(" ");
        this.ky_hieu = words[0];
        this.ten = words[1];
        this.don_gia = words[2];
        this.phi_phuc_vu = words[3];
    }

    @Override
    public String toString() {
        return   ky_hieu + " " + ten + " " + don_gia + " " + phi_phuc_vu;
    }
    @Override
    public int compareTo(LoaiPhong o){
        if(this.ten.compareTo(o.ten) > 0){
            return 1;
        }
        return -1;
    }
}
public class Loai_Phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
