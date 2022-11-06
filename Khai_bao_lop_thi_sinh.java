/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

/**
 *
 * @author admin
 */
    class Student {
        private String msv ;
        private String name;
        private String lop ;
        private Date ns;
        private float GPA ;

    public Student(String name, String lop, String ns, float GPA) throws ParseException{ 
        this.msv = "B20DCCN001 ";
        this.name = name;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.GPA = GPA;
    }
    
    @Override
    public String toString(){
        return msv + name + " " +lop +" " + new SimpleDateFormat("dd/MM/yyyy").format(ns) +" "+String.format("%.2f", GPA);
    }
    }
public class Khai_bao_lop_thi_sinh {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        Student sv = new Student(sc.nextLine() , sc.nextLine() , sc.nextLine() , Float.parseFloat(sc.nextLine()));
        System.out.println(sv);
    }
}
