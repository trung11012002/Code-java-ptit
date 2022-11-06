/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author admin
 */
 class Student {
        String msv="";
        String name;
        String sex;
        String date;
        String address;
        String ma_thue;
        String ngay_ki;
        public void getInformation(){
            Scanner sc= new Scanner(System.in);
            msv="00001 ";
            name = sc.nextLine();
            sex = sc.nextLine();
            date = sc.nextLine();
            address = sc.nextLine();
            ma_thue = sc.nextLine();
            ngay_ki = sc.nextLine();
        }
        public void fix_date(String s){
            ArrayList<String> mang = new ArrayList();
            for(int i=0;i<s.length();i++){
                mang.add(Character.toString(s.charAt(i)));
            }
            if(!mang.get(2).equals("/")){
                mang.add(0, "0");
            }
            
            if(!mang.get(5).equals("/")){
                mang.add(3,"0");
            }
            for(int j=0;j<mang.size();j++){
                System.out.print(mang.get(j));
            }
            System.out.print(" ");
            
        }
        
        public void display(){
            System.out.print(msv);
            System.out.print(name + " ");
            System.out.print(sex +" ");
            fix_date(date);
            System.out.print(address + " ");
            
            System.out.printf(ma_thue +" ");
            fix_date(ngay_ki);
        }
    }
public class Khai_bao_lop_nhan_vien {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }
}
