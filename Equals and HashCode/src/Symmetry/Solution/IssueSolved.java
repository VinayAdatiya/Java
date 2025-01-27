package Symmetry.Solution;

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
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return id == child.id && name.equals(child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Person{
    private Child child;
    private String schoolName;

    public Person(int id , String name , String schoolName) {
        this.child = new Child(id,name);
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return child.equals(person.child) && schoolName.equals(person.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(child, schoolName);
    }
}

public class IssueSolved {

        public static void main(String[] args) {
            Child c1 = new Child(1,"Vinay");
            Child c2 = new Child(1,"Vinay");

            Person stu1 = new Person(1,"Vinay","SCET");
            Person stu2 = new Person(1,"Vinay","SCET");

            System.out.println("Child1 Equals Child2 :- "+c1.equals(c2)); // True
            System.out.println("Student1 Equals Student2 :- "+stu1.equals(stu2)); // True

            //Symmetry Achieved
            System.out.println("Child1 Equals Student1 :- "+c1.equals(stu1)); //False
            System.out.println("Student1 Equals Child1 :- "+stu1.equals(c1)); //False


        }
    }