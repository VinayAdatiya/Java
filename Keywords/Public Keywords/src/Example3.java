class C
{
    public void msg()
    {
        System.out.println("Try it");
    }
}
class Example3 extends C {
    public void msg()
    {
        System.out.println("Try to access the overridden method");
    }
    public static void main(String[] args) {
        Example3 p=new Example3();
        p.msg();

    }
}  