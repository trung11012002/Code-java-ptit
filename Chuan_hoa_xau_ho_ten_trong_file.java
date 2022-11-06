/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author admin
 */
public class Chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        Scanner sc = new Scanner(file);
        ArrayList <String> mang = new ArrayList<String>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.compareTo("END") == 0){
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            
            while(st.hasMoreTokens()){
                String z = st.nextToken();
                z = z.toLowerCase();
                z = (z.charAt(0)+"").toUpperCase() + z.substring(1);
                mang.add(z);
            }
            String kq = mang.get(0);
            for(int i=1;i<mang.size();i++){
                kq = kq + " " + mang.get(i);
            }
            System.out.println(kq);
            mang.clear();
        }
    }
}
