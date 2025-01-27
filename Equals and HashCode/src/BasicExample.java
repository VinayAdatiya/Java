//Why we need Equals and HashCode
class Student{
    private int id;
    private String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student stu1 = new Student(1,"Vinay");
        Student stu2 = new Student(1,"Vinay");

        System.out.println("stu1 equals stu2 :- "+stu1.equals(stu2)); //False
    }
}

// Reason Behind this :- equals by default compare the reference the two objects
// Here Values are same but reference are different for each object
