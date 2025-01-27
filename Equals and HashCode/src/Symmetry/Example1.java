package Symmetry;

import java.util.Objects;

class Child{
    private int id;
    private String name;

    public Child(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Child child = (Child) o;
        return id == child.id && name.equals(child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Student extends Child{
    private String schoolName;

    public Student(int id, String name, String schoolName) {
        super(id, name);
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return schoolName.equals(student.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName);
    }
}

public class Example1{
    public static void main(String[] args) {
        Child c1 = new Child(1,"Vinay");
        Child c2 = new Child(1,"Vinay");
        Student stu1 = new Student(1,"Vinay","SCET");
        Student stu2 = new Student(1,"Vinay","SCET");

        System.out.println("Child1 Equals Child2 :- "+c1.equals(c2)); // True
        System.out.println("Student1 Equals Student2 :- "+stu1.equals(stu2)); // True


        System.out.println("Child1 Equals Student1 :- "+c1.equals(stu1)); //True
        System.out.println("Student1 Equals Child1 :- "+stu1.equals(c1)); //False
    }
}
