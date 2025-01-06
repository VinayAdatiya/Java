package com.example;
import com.java.A;
public class Example1 {
    public static void main(String args[]){
//        A a = new A();
        try{
//            a.msg();  Protected method cannot accessed outside the class
//            System.out.println(a.msg);    protected field cannot accessed outside the class
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
