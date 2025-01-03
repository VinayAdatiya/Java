public class Employee {
    private short id;

    public Employee(short id){
        System.out.println("Constructor is called");
        this.id = id;
    }

    public short getId(){
        System.out.println("Getter Method is called");
        return id;
    }

    public void setId(short id){
        System.out.println("Setter Method is called");
        this.id = id;
        System.out.println("Value is Updated Successfully");
    }

    public static void main(String args[]){
        Employee emp = new Employee((short)12345);
        System.out.println("Employee Id :- "+emp.getId());

        // Update Employee ID
        emp.setId((short) 3456);
        System.out.println("New Employee Id :- "+emp.getId());
    }
}
