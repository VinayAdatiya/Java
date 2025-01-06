class F
{
    public void msg()
    {
        System.out.println("Try it");
    }
}

class Example6 extends F {
//    protected void msg()
//    {
//        System.out.println("Try to access the overridden method");
//    }
    public static void main(String[] args) {
        Example6 p=new Example6();
        p.msg();
    }
}