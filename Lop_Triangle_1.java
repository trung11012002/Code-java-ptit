
package tong_hop_code_ptitt;
import java.text.*;
import java.util.*;
/**
 *
 * @author ADMIN
 */
class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static Point nextPoint(Scanner sc){
        Point p = new Point(sc.nextDouble(), sc.nextDouble());
        return p;
    }
    
    public double distance(Point sp){
        double kc = Math.sqrt((sp.getX()-this.x)*(sp.getX()-this.x)+(sp.getY()-this.y)*(sp.getY()-this.y));
        return kc;
    }
    
    public double distance(Point p1, Point p2){
       double kc = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
       return kc;
    }
}

class Triangle {
    private Point p1, p2, p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public boolean valid(){
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        if(a >= b + c || b >= a + c || c >= a + b){
            return false;
        }
        return true;
    }
    
    public String getPerimeter(){
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        DecimalFormat df = new DecimalFormat("#.000");
        return df.format(a+b+c);
    }
}

public class Lop_Triangle_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main1524758(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}


