/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class LapTrinh implements Comparable<LapTrinh>{
    private String hoTen;
    private long lamDung , submit;

    public LapTrinh(String hoTen, long lamDung, long submit) {
        this.hoTen = hoTen;
        this.lamDung = lamDung;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return  hoTen + " " + lamDung + " " + submit ;
    }
    @Override
    public int compareTo(LapTrinh o){
        if(this.lamDung < o.lamDung) {
            return 1;
        }
        if(this.lamDung == o.lamDung && this.submit > o.submit) {
            return 1;
        }
        if(this.lamDung == o.lamDung && this.submit == o.submit && this.hoTen.compareTo(o.hoTen) > 0) {
            return 1;
        }
        return -1;
    }
}
public class Luyen_tap_lap_trinh {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(new File("LUYENTAP.in"));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<LapTrinh> ds = new ArrayList<LapTrinh>();
        for(int i=0;i<n;i++){
            LapTrinh sv = new LapTrinh(sc.nextLine() , sc.nextLong() ,sc.nextLong());
            sc.nextLine();
            ds.add(sv);
        }
        Collections.sort(ds);
        for(LapTrinh xxx : ds){
            System.out.println(xxx);
        }
    }
}
