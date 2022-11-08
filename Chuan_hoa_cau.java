/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Chuan_hoa_cau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();
        String kq = "";
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String z = st.nextToken();
                ds.add(z);
            }
            for (int i = 0; i < ds.size(); i++) {
                String z = ds.get(i);
                int k = z.length() - 1;
                if (z.compareTo("?") == 0 || z.compareTo("!") == 0 || z.compareTo(".") == 0) {
                    kq = kq.trim();
                    kq = kq + z;
                    System.out.print(kq.substring(0, 1).toUpperCase());
                    System.out.println(kq.substring(1 , kq.length()));
                    kq = "";
                    continue;
                }
                if (z.charAt(k) == '.' || z.charAt(k) == '?' || z.charAt(k) == '!') {
                    kq = kq + z;
                    kq = kq.trim();
                    System.out.print(kq.substring(0, 1).toUpperCase());
                    System.out.println(kq.substring(1));
                    kq = "";
                }
                else {
                    kq = kq + z + " ";
                }
            }
            
            if (kq.length() > 0) {                
                kq = kq.trim();
                System.out.print(kq.substring(0, 1).toUpperCase());
                System.out.println(kq.substring(1) + ".");
                kq = "";
            }
            ds.clear();
        }
    }
}
