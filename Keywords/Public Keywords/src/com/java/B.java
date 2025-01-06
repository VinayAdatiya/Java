package com.java;

public class B{
    public String msg="Try to access a public variable outside the package";
    String info;
    public void display()
    {
        System.out.println("Try to access a public method outside the package");
        System.out.println(info);
    }

    public B(String msg)
    {
        this.info=msg;
    }

}