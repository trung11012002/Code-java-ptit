/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class So_nguyen_to_trong_File_nhi_phan {
    static int [] x = new int[1000000+1];
    public static boolean ng_to(int n){
        if(n < 2) return false;
        for(int i=0;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //FileInputStream file = new FileInputStream("SONGUYEN.in");
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        //Map<Integer ,Integer> map = new LinkedHashMap<Integer,Integer>();
        int [] a = new int[1000000+1];
        for(Integer z : list){
            if(ng_to(z)){
                a[z]++;
            }
        }
        int cnt = 1;
        for(int i=1000000;i >= 0;i--){
            if(a[i] >= 1 && cnt <= 10){
                cnt++;
                System.out.println(i +" " +a[i]);
            }
        }
    }
}
