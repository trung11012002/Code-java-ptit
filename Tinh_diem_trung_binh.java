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
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
class BangDiem implements Comparable<BangDiem>{
    private String ma;
    private String ten;
    private double diem1;
    private double diem2;
    private double diem3;
    private static int cnt =1;
    public BangDiem(String ten, double diem1, double diem2, double diem3) {
        this.ma = String.format("SV%02d", cnt++);
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public double DiemTb(){
        double sum = this.diem1*3 + this.diem2*3 + this.diem3*2;
        double tmp = (double)sum/8;
        return tmp;
    }
//    private String chuan_hoa_diem_tb(){
//       String s = this.DiemTb() +"";
//       if(s.charAt(s.length() - 1) == '0' && s.charAt(s.length()-2) == '0' && s.charAt(s.length() - 3) == '.'){
//           s=s.substring(0,s.length()-3);
//       }
//       return s;
//   }
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
        return  ma + " " + chuan_hoa_ho_ten() + " " +String.format("%.2f", this.DiemTb())+" ";
    }
    @Override
    public int compareTo(BangDiem o){
        if(this.DiemTb() < o.DiemTb()){
            return 1;
        }
        if(this.DiemTb() == o.DiemTb() && this.ma.compareTo(o.ma) > 0){
            return 1;
        }
        return -1;
    }
}
public class Tinh_diem_trung_binh {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n =Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> ds = new ArrayList<BangDiem>();
        ArrayList<Double> arr = new ArrayList<Double>();
        for(int i=0;i<n;i++){
            BangDiem sv = new BangDiem(sc.nextLine() ,Double.parseDouble(sc.nextLine()) ,Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ds.add(sv);
            arr.add(sv.DiemTb());
        }
        Collections.sort(ds);
        Collections.sort(arr,(o1,o2) -> o2.compareTo(o1));
        for(BangDiem xxx : ds){
            System.out.print(xxx);
            for(int i=0;i<arr.size();i++){
                if(xxx.DiemTb() == arr.get(i)){
                    System.out.println((i+1));
                    break;
                }
            }
        }
    }
}