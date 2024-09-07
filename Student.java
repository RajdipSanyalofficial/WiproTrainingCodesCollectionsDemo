package collectionsdemo;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(age == o.age)
            return 0;
        else if (age > o.age) {
            return 1;
        }
        else
            return -1;
    }
}

