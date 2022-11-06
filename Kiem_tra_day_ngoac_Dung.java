/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class Kiem_tra_day_ngoac_Dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = s.length();
            int res = 0;
            Stack <Integer> st = new Stack<Integer>();
            st.push(-1);
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else {
                    st.pop();
                    if(st.size() > 0)
                        res = Math.max(res , i - st.peek());
                    if(st.empty()) st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
