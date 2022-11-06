/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Liet_ke_theo_thu_tu_Xuat_hien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> lst = (ArrayList<String>) ois.readObject();
        Set<String> s = new TreeSet<>();
        for (String i : lst) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            s.addAll(Arrays.asList(words));
        }
        Scanner in = new Scanner(new File("VANBAN.in"));
        while(in.hasNext()) {
            String x = in.next().toLowerCase();
            if (s.contains(x)) {
                System.out.println(x);
                s.remove(x);
            }
        }
    }
}
