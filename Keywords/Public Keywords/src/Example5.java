class E
{
    public void msg()
    {
        System.out.println("Try it");
    }
}

class Example5 extends E {
//    void msg()
//    {
//        System.out.println("Try to access the overridden method");
//    }
    public static void main(String[] args) {
        Example5 p=new Example5();
        p.msg();

    }
}  