package com.java;

public class A {
    String msg;
    protected A(String msg){
        this.msg = msg;
    }
    public void display(){
        System.out.println(msg);
    }
//    protected String msg = "Try to access the protected variable outside the package";
    protected void msg(){
        System.out.println("Try to access protected method outside the package");
    }
}

