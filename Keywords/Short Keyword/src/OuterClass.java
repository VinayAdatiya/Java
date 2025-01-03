public class OuterClass {

    //Private Field
    private short outerField;

    //Constructor for OuterClass
    public OuterClass(short outerField){
        this.outerField = outerField;
    }

    //getter method
    public short getOuterField(){
        return outerField;
    }

    //Inner Class
    class InnerClass{
        private short InnerField;
        public InnerClass(short InnerField){
            this.InnerField = InnerField;
        }
        public short getInnerField(){
            return InnerField;
        }
        public void setInnerField(short InnerField){
            this.InnerField = InnerField;
        }
    }

    //main method of OuterClass
    public static void main(String args[]){
        OuterClass oc = new OuterClass((short)500);
        OuterClass.InnerClass ic = oc.new InnerClass((short)1000);
        // Print the values of outer and inner fields
        System.out.println("Outer field: " + oc.getOuterField());
        System.out.println("Inner field: " + ic.getInnerField());
        ic.setInnerField((short) 200);
        System.out.println("Updated inner field: " + ic.getInnerField());
    }
}
