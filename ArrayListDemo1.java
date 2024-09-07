/**
 * Java ArrayList class uses a dynamic array for storing the elements.
 * It is like an array, but there is no size limit.
 *   We can add or remove elements anytime. So, it is much more flexible than the traditional array.
 *
 * Java Program to add,manipulate & display elements using ArrayList
 *   Frequent Search Operations use ArrayList
 */

package collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> pl = new ArrayList<>();

        pl.add("Java");
        pl.add("Perl");
        pl.add("C++");
        pl.add("Python");

        System.out.println("Programming Languages Arraylist : "+pl);

        System.out.println("Element at index 1 : "+pl.get(1));

        pl.add(2,"Spring");

        pl.set(4,"Ruby");

        System.out.println("After manipulations : "+pl);


//ArrayList methods
        System.out.println("Does ArrayList Consists of Java ? : "+pl.contains("java"));
        System.out.println("Is ArrayList empty ? :"+pl.isEmpty());
        System.out.println("The Position of Python is :"+pl.indexOf("Perl"));
        System.out.println("The Size of ArrayList is : "+pl.size());


        //Define ArrayList to Store marks
        ArrayList<Integer> marks =new ArrayList<>();

        marks.add(89); //AutoBoxing - Convert primitive type to Object Type Automatically
        marks.add(35);
        marks.add(95);
        marks.add(60);
        marks.add(56);
        marks.add(23);

        //marks.add("Java"); //Compile Error - Type Safety
        System.out.println("The Marks ArrayList : "+marks);
        System.out.println("The Total No. of Marks is : "+marks.size());

        //AutoUnboxing - Convert Object type to primitive Type Automatically
        System.out.println("Marks at 3rd Index : "+marks.get(3));

        for (int i:marks)
            System.out.println(i);


    }
}
