class D
{
    public void msg()
    {
        System.out.println("Try it");
    }
}

class Example4 extends D {
//    private void msg()
//    {
//        System.out.println("Try to access the overridden method");
//    }
    public static void main(String[] args) {
        Example4 p=new Example4();
        p.msg();
    }
}  