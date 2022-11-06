/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.math.BigInteger;
/**
 *
 * @author admin
 */
public class Tach_doi_va_tinh_tong {
    public static void main(String[] args) throws FileNotFoundException{
        File file  =  new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s="";
        while(sc.hasNext()){
             s = sc.next();
        }
        while(s.length() > 1){
            
            int k = s.length();
            int vt = (int)(k/2);
            BigInteger x1 = new BigInteger(s.substring(0, vt),10);
            BigInteger x2 = new BigInteger(s.substring(vt) , 10);
            BigInteger tong = x1.add(x2);
            System.out.println(tong);
            s = tong.toString();
        }
        
    }
}
