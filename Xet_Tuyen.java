/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author ADMIN
 */
class TuyenDung {
    private int id;
    private String hoTen;
    private Date ngaySinh;
    private float diemLT, diemTH;
    private static int cnt = 1;
    public TuyenDung(String hoTen, String ngaySinh, float diemLT, float diemTH) throws ParseException {
        this.id = cnt++;
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    
    private String chuanhoaHoTen(String s){
        s = s.toLowerCase();
        String res = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            res += (tmp.substring(0,1).toUpperCase() + tmp.substring(1) + " ");
        }
        return res;
    }
    
    public int Tuoi(){
        return 2021 - (1900 + ngaySinh.getYear());
    }
    
    public float DiemThuong(){
        if(diemLT >= 8 && diemTH >= 8) return 1;
        else if(diemLT >= 7.5 && diemTH >= 7.5) return (float)0.5;
        return 0;
    }
    
    public int DiemXL(){
        float tmp = (diemLT + diemTH) / 2 + this.DiemThuong();
        int res = Math.round(tmp);
        if(res > 10) return 10;
        else return res;
    }
    
    public String XepLoai(){
        if(this.DiemXL() >= 9) return "Xuat sac";
        else if(this.DiemXL() == 8) return "Gioi";
        else if(this.DiemXL() == 7) return "Kha";
        else if(this.DiemXL() >= 5) return "Trung binh";
        return "Truot";
    }

    @Override
    public String toString() {
        return "PH" + String.format("%02d",id) + " " + chuanhoaHoTen(hoTen) + " " 
                + this.Tuoi() + " " + this.DiemXL() + " " + this.XepLoai();
    }
}

public class Xet_Tuyen {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<TuyenDung> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            TuyenDung tmp = new TuyenDung(in.nextLine(), in.nextLine(), 
                Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            a.add(tmp);
        }
        for(TuyenDung o : a){
            System.out.println(o);
        }
    }
}
