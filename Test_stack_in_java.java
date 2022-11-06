/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tong_hop_code_ptitt;
import java.util.*;
/**
 *
 * @author admin
 */
public class Test_stack_in_java {
    public static void main(String[] args) {
//        Stack<Character> st = new Stack<>();
//        List<Character> list =new  ArrayList<Character>();
////        list.add('3');
////        list.add('2');
////        list.add('1');
////        list.add('3');
//        st.push('1');
//        st.push('3');
//        st.push('2');
//        st.push('5');
//        st.add('5');
//       // st.addAll(list);
//        int a = st.indexOf('5');
//        System.out.println(a);
////        while(!st.empty()){
////            System.out.println(st.pop());
////        }
//    }
//}

            Queue <Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(3);
            System.out.println(q.poll());
            System.out.println(q.poll());
    }
}