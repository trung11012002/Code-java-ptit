/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.math.*;
class Point{
    double x ;
    double y;
    void input(Scanner sc){
        x = sc.nextDouble();
        y = sc.nextDouble();
        
    }
     Double distance(Point p){
        double a = this.x - p.x;
        double b = this.y - p.y;
        return Math.sqrt(a*a + b*b);
    }
    double check(Point A , Point B){
        double x1 = this.distance(A);
        double x2 = this.distance(B);
        double x3 = A.distance(B);
        if(x1 >= x2 + x3 || x2 >= x1 + x3 || x3 >= x1 + x2 ){
            return -1;
        }
        else {
            return x1 + x2 + x3 ;
        }
    }
     
}
/**
 *
 * @author admin
 */
public class Chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();
        A.input(sc);
        B.input(sc);
        C.input(sc);
        double k = A.check(B, C);
        if(k != -1){
            System.out.printf("%.3f\n" , k);
        }
        else {
            System.out.println("INVALID");
        }
        }
    }
}
