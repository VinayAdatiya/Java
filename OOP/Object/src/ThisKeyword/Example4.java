package ThisKeyword;


class C {
    Example4 obj;
    C(){}
    C(Example4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}

class Example4{
    int data=10;
    Example4(){
        C b=new C(this);
        b.display();
    }
    public static void main(String args[]){
        Example4 a=new Example4();
        System.out.println(a.data);
//        C d = new C();
//        System.out.println(d.data);
    }
}

