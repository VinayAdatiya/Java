//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
package ThisKeyword;

public class Example3 {
        void m(Example3 obj){
            System.out.println("method is invoked");
        }
        void p(){
            m(this);
        }
        public static void main(String args[]){
            Example3 s1 = new Example3();
            s1.p();
        }
    }

