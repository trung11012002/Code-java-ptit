/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.*;
import java.math.*;
/**
 *
 * @author admin
 */
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point p){
        double x0=this.x - p.x;
        double y0=this.y-p.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
    
}
public class Khai_bao_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point A = new Point(sc.nextDouble() , sc.nextDouble());
        Point B = new Point(sc.nextDouble() , sc.nextDouble());
            System.out.printf("%.4f\n" , A.distance(B));
        }
    }
}
