package tong_hop_code_ptitt;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
 
    private String studentIdString, studentNameString, studentNumberString;
    private int id;
    private Group group;
 
    public Student(String aString, String bString, String cString, Integer dInteger) {
        this.studentIdString = aString;
        this.studentNameString = bString;
        this.studentNumberString = cString;
        this.id = dInteger;
        this.group = new Group();
    }
 
    public String getStudentIdString() {
        return studentIdString;
    }
 
    public void getInformation() {
        System.out.println(studentIdString + " " + studentNameString
                + " " + studentNumberString + " " + group.getInformation(id));
    }
}

class Group {
 
    private static Map<Integer, String> group  = new HashMap<>();;
 
    public static void setGroup(Integer bInteger, String aString) {
        group.put(bInteger, aString);
    }
 
    public Group() {
    }
 
    public String getInformation(Integer aInteger) {
        return aInteger + " " + group.get(aInteger);
    }
 
}
public class Test {
 
    public static List<Student> l;
    public static int numberOfStudent;
 
    public static void input() {
        l = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        numberOfStudent = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numberOfStudent; i++) {
            Student token = new Student(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt());
            in.nextLine();
            l.add(token);
        }
        for (int i = 0; i < m; i++) {
            Group.setGroup(i + 1, in.nextLine());
        }
    }
 
    public static void solve() {
        Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getStudentIdString().compareTo(
                        b.getStudentIdString());
            }
        });
    }
 
    public static void output() {
        for (int i = 0; i < numberOfStudent; i++) {
            l.get(i).getInformation();
        }
    }
 
    public static void main(String[] args) {
        input();
        solve();
        output();
    }
}
 
 