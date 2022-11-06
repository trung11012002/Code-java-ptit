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
public class Loai_bo_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            ArrayList<String> mang = new ArrayList();
            for(int i=0;i<s.length();i++){
                mang.add(Character.toString(s.charAt(i)));
            }
            int v=0;
            boolean ok = true;
            while(ok){
                ok=false;
                if(mang.size() < 3){
                    break;
                }
                for(int i=0;i < mang.size()-2;i++){
                    
                    if((mang.get(i)).compareTo("1") == 0 &&(mang.get(i+1)).compareTo("0") ==0&&(mang.get(i+2)).compareTo("0") == 0){
                        v = v + 3;
                        mang.remove(i);
                        mang.remove(i);
                        mang.remove(i);
                        ok=true;
                        break;
                    }
                }
                 
            }
            System.out.println(v);
            mang.clear();
        }
    } 
}
