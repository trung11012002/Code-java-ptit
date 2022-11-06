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
class DanhSach implements Comparable<DanhSach>{
    private String ten;
    public DanhSach(String ten) {
        this.ten = ten;
    }
    private String chuan_hoa_ten(){
        String s = this.ten;
        ArrayList<String> s1 = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String z = st.nextToken();
            z = z.toLowerCase();
            z = z.substring(0, 1) + z.substring(1);
            s1.add(z);
        }
        String zz = s1.get(s1.size() -1);
        for(int i=0;i<s1.size()-1;i++){
            zz = zz +" " +s1.get(i);
        }
        s1.clear();
        return zz;
    }
    private String in(){
        String s = this.ten;
        ArrayList<String> s1 = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String z = st.nextToken();
            z = z.toLowerCase();
            z = z.substring(0, 1).toUpperCase() + z.substring(1);
            s1.add(z);
        }
        String zz = s1.get(0);
        for(int i=1;i<s1.size();i++){
            zz = zz +" " +s1.get(i);
        }
        s1.clear();
        return zz;
    }
    @Override
    public String toString() {
        return in();
    }
    @Override
    public int compareTo(DanhSach o){
        if(this.chuan_hoa_ten().compareTo(o.chuan_hoa_ten()) > 0){
            return 1;
        }
        return -1;
    }
}
public class Chuan_hoa_va_sap_xep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        //Scanner sc = new Scanner(System.in);
        ArrayList<DanhSach> ds = new ArrayList<DanhSach>();
        while(sc.hasNextLine()){
            DanhSach sv = new DanhSach(sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds);
        for(DanhSach xxx : ds){
            System.out.println(xxx);
        }
    }
}
