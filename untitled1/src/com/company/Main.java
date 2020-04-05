package com.company;

import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int mark;
    Student(String n, int k) {
        this.name = n;
        this.mark = k;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return mark - s.getMark();
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> treeSet = new TreeSet<Student>();
        while (true) {
            String full_string = scanner.nextLine();
            if (!full_string.isEmpty()) {
                String[] students = full_string.split(" ");
                String students_name = students[0];
                int students_mark = Integer.parseInt (students[1]);
                treeSet.add(new Student(students_name,students_mark));
            } else {
                break;
            }
        }
        Iterator<Student> rule = treeSet.iterator();
        while(rule.hasNext()) {
            if(rule.next().getMark() < 5) {
                rule.remove();
            }
        }
        for(Student s: treeSet) {
            System.out.println("Student`s name is " + s.getName() + " and mark is " + s.getMark());
        }
    }
}