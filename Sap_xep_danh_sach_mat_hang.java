/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
/**
 *
 * @author admin
 */
class Mat_hang{
    String ma ="";
    String ten;
    String nhom;
    Double mua;
    Double ban;
    Double loi_nhuan;
        
    void input(Scanner sc){
        ten = sc.nextLine();
        nhom = sc.nextLine();
        mua = Double.parseDouble(sc.nextLine());
        ban = Double.parseDouble(sc.nextLine());
        loi_nhuan = ban - mua;
    }
}
public class Sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Mat_hang [] mh  = new Mat_hang[n];
        int x= 1;
        for(int i=0;i<n;i++){
            mh[i] = new Mat_hang();
            mh[i].input(sc);
            mh[i].ma = x+"";
            x++;
        }
        Mat_hang xxx = new Mat_hang();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(mh[i].loi_nhuan < mh[j].loi_nhuan){
                    xxx = mh[i];
                    mh[i]=mh[j];
                    mh[j] = xxx;
                }
                if(mh[i].loi_nhuan == mh[j].loi_nhuan && mh[i].ma.compareTo(mh[j].ma) > 0){
                    xxx = mh[i];
                    mh[i]=mh[j];
                    mh[j] = xxx;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(mh[i].ma +" " + mh[i].ten +" " + mh[i].nhom +" " );
            System.out.printf("%.2f\n" , mh[i].loi_nhuan);
        }
    }
}
