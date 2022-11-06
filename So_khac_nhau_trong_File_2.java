/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author admin
 */
public class So_khac_nhau_trong_File_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.in"));
        int [] a = new int[1000];
        for(int i=0;i<100000;i++){
            int x = dt.readInt();
            a[x]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i] > 0)
                System.out.println(i + " " +a[i]);
        }
    }
}
