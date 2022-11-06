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
class TienDien implements Comparable<TienDien>{
    private String ma,ten,loai;
    private long chiSoDau,chiSoSau;
    private static int cnt =1;
    public TienDien(String ten, String loai, long chiSoDau, long chiSoSau) {
        this.ma = String.format("KH%02d",cnt++);
        this.ten = ten;
        this.loai = loai;
        this.chiSoDau = chiSoDau;
        this.chiSoSau = chiSoSau;
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
    private long dinhMuc(){
        if(this.loai.compareTo("A") == 0) return 100;
        else if(this.loai.compareTo("B") == 0) return 500;
        else return 200;
    }
    private long tienTrongDinhMuc(){
        long tmp = this.chiSoSau-this.chiSoDau;
        if(tmp < dinhMuc()) return tmp*450;
        if(tmp > dinhMuc()) return dinhMuc()*450;
        return 0;
    }
    private long tienVuotDinhMuc(){
        long tmp = this.chiSoSau - this.chiSoDau;
        if(tmp > dinhMuc()) return (tmp - dinhMuc())*1000;
        else return 0;
    }
    private double thueVAT(){
        return (double)tienVuotDinhMuc()*5/100;
    }
    private double soTienPhaiNop(){
        return (double)((double)tienTrongDinhMuc() + (double)tienVuotDinhMuc() + (double)thueVAT());
    }
    @Override
    public String toString() {
        return  ma + " "+ chuan_hoa_ho_ten() + " " + tienTrongDinhMuc()+" "+tienVuotDinhMuc()+" "+
               String.format("%.0f",thueVAT())+" " +String.format("%.0f",soTienPhaiNop());
    }
    @Override
    public int compareTo(TienDien o){
        if(this.soTienPhaiNop() < o.soTienPhaiNop()){
            return 1;
        }
        return -1;
    }
}
public class Tinh_tien_dienn {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<TienDien> ds = new ArrayList<TienDien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            TienDien sv = new TienDien (sc.nextLine() ,sc.next(),
                    sc.nextLong() , sc.nextLong());
                    sc.nextLine();
                    ds.add(sv);
        }
        Collections.sort(ds);
        for(TienDien xxx : ds){
            System.out.println(xxx);
        }
    }
}
