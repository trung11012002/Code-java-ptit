/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

/**
 *
 * @author admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        //File file = new File("C:\\CODE JAVA FILE\\DATA.txt");
        ArrayList<String> mang = new ArrayList<String>();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
                   String zz = st.nextToken();
            try {
                Integer.parseInt(zz);
            } catch(NumberFormatException x){
                mang.add(zz);            
             }           
            }
        }
        Collections.sort(mang , (o1,o2) -> o1.compareTo(o2));
        for(String xxx : mang){
            System.out.print(xxx + " ");
        }
    }
}
