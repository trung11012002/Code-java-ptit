package tong_hop_code_ptitt;
import java.util.Scanner;
class Rectange {
    private double w;
    private double h;
    private String color;

    public Rectange(double w, double h, String color) {
        this.w = w;
        this.h = h;
        this.color = color;
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }
    
    public int check() {
        int W = (int) this.w;
        int H = (int) this.h;
        if (W != w || H != h || W <= 0 || H <= 0)
            return 0;
        return 1;
    }

    public double findArea() {
        return w * h;
    }

    double findPerimeter() {
        return (w + h) * 2;
    }

    public void output() {
        if (this.check() == 0)
            System.out.print("INVALID");
        else
            System.out.printf("%d %d %s", (int) this.findPerimeter(), (int) this.findArea(), this.color);
    }
}

public class Khai_bao_lop_hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange rec = new Rectange(sc.nextDouble() , sc.nextDouble() , sc.next());
        rec.output();
    }
}