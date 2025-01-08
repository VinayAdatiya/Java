//Two Methods of the Object class to compare the object
//Java equals() Method
//Java hashCode() Method

class Employee
{
    private int regno;
    private String name;
    //constructor of Employee class
    public Employee(int regno, String name)
    {
        this.name = name;
        this.regno = regno;
    }
    public int getRegno()
    {
        return regno;
    }
    public void setRegno(int Regno)
    {
        this.regno = regno;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        return this.getRegno() == ((Employee)obj).getRegno();
    }
}


public class ObjComparison {
    public static void main(String[] args) {
        Double x = 123.4567;
        Long y = 9999999L;

        System.out.println("Object are not equal hence it returns "+x.equals(y));
        System.out.println("Objects are equal hence it returns "+x.equals(123.4567));

        Employee emp1 = new Employee(918,"Maria");
        Employee emp2 = new Employee(918,"Maria");

        int a = emp1.hashCode();
        int b = emp2.hashCode();

        //we modified equals method by overriding it
        //Modification :- if regno is same then also obj are same
        System.out.println("Comparing Objects emp1 and emp2 = "+emp1.equals(emp2));
    }
}
// IMPORTANT
//     == operator compares that two references are identical or not.
//     equals() method compares two objects.