/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
/**
 *
 * @author admin
 */
class Point3D{
     private int x ,y, z;
     
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
     
     public static boolean check(Point3D p1 , Point3D p2 ,Point3D p3 ,Point3D p4){
        int n1x = p1.x - p2.x;
        int n1y = p1.y - p2.y;
        int n1z = p1.z - p2.z;
        
        int n2x = p1.x - p3.x;
        int n2y = p1.y - p3.y;
        int n2z = p1.z - p3.z;
        
        int n0x = n1y*n2z - n1z*n2y;
        int n0y = n1z * n2x - n1x *n2z;
        int n0z = n1x*n2y - n1y*n2x;
        
        int c = -(n0x*p3.x + n0y*p3.y + n0z*p3.z);
        
        int d = n0x*p4.x + n0y*p4.y + n0z*p4.z + c;
        if(d == 0 ){
            return true;
        }
        else return false;
    }
}
public class Bon_diem_mat_phang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1, p2, p3, p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
