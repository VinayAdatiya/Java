package com.example;
class A{
    protected String msg = "Try to access the protected variable outside the class within the package";
}
public class Example2 {
    public static void main(String args[]){
        A a = new A();
        System.out.println(a.msg);
    }
}
