package tong_hop_code_ptitt;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.text.*;
class Time implements Comparable<Time>{
    private int h , m ,s;

    public Time(int h, int m, int s) throws ParseException{
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return   h + " " + m + " " + s ;
    }
    @Override
    public int compareTo(Time o){
        if(this.h > o.h){
            return 1;
        } 
        if(this.h == o.h && this.m > o.m){
            return 1;
        }
        if(this.h == o.h && this.m == o.m && this.s > o.s){
            return 1;
        }
        return -1;
    }
}
public class Sap_xep_thoi_gian {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> ds = new ArrayList<Time>();
        for (int i = 0; i < n; i++) {
            Time sv = new Time(sc.nextInt() , sc.nextInt() , sc.nextInt());
            ds.add(sv);
        }
        
        Collections.sort(ds);
        for(Time sv : ds){
            System.out.println(sv);
        }
    }
}