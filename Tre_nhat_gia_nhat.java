/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author admin
 */
class Tuoi{
    String tong_hop;
    String ten;
    String ngay_sinh;
    String ngay_sinh_xet="";
    void input(Scanner sc){
        tong_hop = sc.nextLine();
        StringTokenizer st = new StringTokenizer(tong_hop);
        int ll = 1;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            if(ll == 1){
                ten = s;
            }
            if(ll==2){
                ngay_sinh = s;
            }
            ll++;
            
        }
        ngay_sinh_xet = ngay_sinh.substring(6) + ngay_sinh.substring(3, 5) + ngay_sinh.substring(0, 2);
    }
}
public class Tre_nhat_gia_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Tuoi [] t = new Tuoi[n];
        for(int  i=0;i<n;i++){
            t[i] = new Tuoi();
            t[i].input(sc);
        }
        Tuoi xxx = new Tuoi();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(t[i].ngay_sinh_xet.compareTo(t[j].ngay_sinh_xet) < 0){
                    xxx = t[i];
                    t[i] = t[j];
                    t[j] = xxx;
                }
            }
        }
        
        
        System.out.println(t[0].ten);
          System.out.println(t[n-1].ten);
    }
}
