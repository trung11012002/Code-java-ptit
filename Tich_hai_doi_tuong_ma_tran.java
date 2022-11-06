/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Matrix{
    private int n ,m;
    private int [][] a = new int[50][50];
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public Matrix() {
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<this.n ;i++){
            for(int j=0;j<this.m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix o){
        Matrix tmp = new Matrix();
        int [][] ketqua = new int[this.n][this.n];
        for(int i=0;i<this.n;i++){
            for(int j=0;j<o.m;j++){
                int res=0;
                for(int k=0;k<this.m ;k++){
                    res = res + this.a[i][k]*o.a[k][j];
                }
                tmp.a[i][j] = res;
                ketqua[i][j] = res;
            }
        }
        tmp.n=this.n;
        tmp.m=o.m;
        return tmp;
    }
    @Override
    public String toString() {
        String s="";
        for(int i =0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
                s = s + this.a[i][j] + " ";
            }
            s+="\n";
        }
        return s;
    }
}
public class Tich_hai_doi_tuong_ma_tran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
