class Animal{
    public String name;
    public String breed;
    public Animal(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public Animal(Animal ob){
        name = ob.name;
        breed = ob.breed;
    }
    public Animal(){

    }

    public void displayInfo(){
        System.out.println("Name :- "+this.name+" Breed:- "+this.breed);
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        System.out.println(this+" "+obj);
        System.out.println(this.hashCode()+" "+obj.hashCode());
        return ((Animal)obj).name.equals(this.name) && ((Animal)obj).breed.equals(this.breed);
    }
}
public class CopyConstructor {


    public static void main(String[] args) {
        Animal ob1 = new Animal("Tommy","Siberian");
        Animal ob2 = new Animal(ob1);
        Animal ob3 = new Animal();

        ob1.displayInfo();
        ob2.displayInfo();

        //coping value from ob1 to ob3
        ob3.name = ob1.name;
        ob3.breed = ob1.breed;

        ob3.displayInfo();

        System.out.println(ob1.equals(ob2));
    }
}
