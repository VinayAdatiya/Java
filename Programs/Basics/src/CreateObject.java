/*
Java provides five ways to create an object.
1. Using new Keyword
2. Using clone() method
3. Using newInstance() method of the Class class
4. Using newInstance() method of the Constructor class
5. Using Deserialization
 */
public class CreateObject {
    public void CreateObject(){
        System.out.println("Constructor is called");
    }
    void show(){
        System.out.println("Invoking show method");
    }
    public static void main(String[] args) {
        CreateObject obj1 = new CreateObject();
        obj1.show();
    }
}
