/**
 * Java Program to sort student object based on age field
 */



package collectionsdemo;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> a1=new ArrayList<Student>();

        Student s1=new Student(101,"Mike",19);
        Student s2=new Student(102,"Jhon",15);
        Student s3=new Student(103,"Harry",13);
        Student s4=new Student(104,"Mary",10);
        Student s5=new Student(105,"Xvaier",17);

        // adding student to list
        a1.add(s2);
        a1.add(s3);
        a1.add(s1);
        a1.add(s4);
        a1.add(s5);

        System.out.println("******* Students List ********");
        for(Student s:a1)
        {
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }

        Collections.sort(a1); //  invokes compareTo() method of Student class

        System.out.println("******* Students Sorted List Based on Age********");
        for(Student s:a1)
        {
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }
    }
}
