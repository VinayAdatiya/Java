//We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).
package ThisKeyword;
class D {
    D getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello java");
    }
}
class Example5{
    public static void main(String args[]){
        new D().getA().msg();
    }
}

