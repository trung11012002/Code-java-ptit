/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
/**
 *
 * @author ADMIN
 */
class DaThuc {
    private Map<Integer, Integer> hs;
    private int bac;

    public DaThuc() {
        hs = new HashMap<>();
    }
    
    public DaThuc(String s) {
        hs = new HashMap<>();
        String tmp = s.replace(" + ", " ");
        String[] arr = tmp.replace("*x^", " ").split(" ");
        this.bac = Integer.parseInt(arr[1]);
        for(int i = 0; i <= this.bac; i++) hs.put(i, 0);
        for(int i = 0; i < arr.length; i+=2){
            hs.put(Integer.parseInt(arr[i+1]), Integer.parseInt(arr[i]));
        }
    }
    
    public DaThuc cong(DaThuc o){
        DaThuc res = new DaThuc();
        res.bac = Math.max(this.bac, o.bac);
        for(int i = this.bac+1; i <= res.bac; i++) this.hs.put(i, 0);
        for(int i = o.bac+1; i <= res.bac; i++) o.hs.put(i, 0);
        for(int i = 0; i <= res.bac; i++){
            res.hs.put(i, this.hs.get(i) + o.hs.get(i));
        }
        return res;
    }
    
    @Override
    public String toString() {
        String res = "" + hs.get(bac) + "*x^" + bac;
        for(int i = this.bac-1; i >= 0; i--){
            if(hs.get(i) > 0) res += (" + " + hs.get(i) + "*x^" + i);
        }
        return res;
    }
}

public class Tong_da_thuc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
    public static void main5106906(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}

