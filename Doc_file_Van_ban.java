/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
/**
 *
 * @author admin
 */
public class Doc_file_Van_ban {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
