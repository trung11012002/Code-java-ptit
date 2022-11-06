/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tong_hop_code_ptitt;
import java.util.*;
import java.math.*;
/**
 *
 * @author ADMIN
 */
class Complex {
    private int re, im;

    public Complex() {
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }
    
    public Complex(Complex c){
    }
    
    public String num(int n){
        if(n < 0){
            return "- " + Math.abs(n);
        } else {
            return "+ " + Math.abs(n);
        }
    }
    
    public Complex add(Complex c){
        Complex res = new Complex();
        res.re = this.re + c.re;
        res.im = this.im + c.im;
        return res;
    }
    
    public Complex mul(Complex c){
        Complex res = new Complex();
        res.re = this.re * c.re - this.im * c.im;
        res.im = this.im * c.re + this.re * c.im;
        return res;
    }

    @Override
    public String toString() {
        return this.re + " " + this.num(this.im) + "i";
    }
    
    
}

public class So_phuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            Complex a = new Complex(in.nextInt(), in.nextInt());
            Complex b = new Complex(in.nextInt(), in.nextInt());
            Complex c = a.mul(a.add(b));
            Complex d = a.add(b);
            d = d.mul(d);
            System.out.println(c + ", " + d);
        }
    }
}
