/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class So_khac_nhau_trong_file_1 {
    static int [] a = new int[1005];
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                int x = Integer.parseInt(st.nextToken());
                a[x]++;
            }
        }
        for(int i=0;i<1005;i++){
            if(a[i] != 0){
                System.out.println(i +" "+ a[i]);
            }
        }
    }
}
