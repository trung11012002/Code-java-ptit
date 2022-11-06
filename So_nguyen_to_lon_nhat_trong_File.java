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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class So_nguyen_to_lon_nhat_trong_File {
    static int [] x = new int[1000000+5];
    public static void sang(){
        for(int i=0;i<=1000000;i++){
            x[i] =1;
        }
        x[0] = x[1] = 0;
        for(int i=2; i*i <= 1000000 ;i++){
            if(x[i] == 1){
                for(int j = i*i ;j <= 1000000 ;j+=i){
                    x[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //FileInputStream file = new FileInputStream("SONGUYEN.in");
        sang();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int [] a = new int [1000005];     
        for(Integer z : list){
            if(x[z] == 1){
                a[z]++;
            }
        }
        int cnt = 0;
        for(int i=1000000;i >= 0;i--){
            if(a[i] >= 1 && cnt < 10){
                cnt++;
                System.out.println(i +" " +a[i]);
            }
            if(cnt >= 10 ){
                break;
            }
        } 
    }
}
