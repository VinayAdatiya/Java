package com.java;

class B {
    protected void msg(){
        System.out.println("Try It");
    }
    protected void msg(String test1){
        System.out.println("Try It");
    }
    protected void msg(String test1 , String test2){
        System.out.println("Try It");
    }
}
class Example6 extends B{
    protected void msg(){
        System.out.println("Do Not");
    }
//    private void msg(String test1){
//        System.out.println("Try It");
//    }
    public void msg(String test1 , String test2){
        System.out.println(test1+" "+test2);
    }
    public static void main(String args[]){
        Example6 obj = new Example6();
        obj.msg();
        obj.msg("Hello");
        obj.msg("Hello","World");
    }
}
