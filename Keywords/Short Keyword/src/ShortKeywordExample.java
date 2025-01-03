//Primitive Data Type
//Range :- >=-32768 to <=32767

public class ShortKeywordExample {
    public short getMyShortValue(){
        return 28768;
    }

    public void printShortValue(short B){
        System.out.println("Short Value printed Using Method :- " + B);
    }

    public static void main(String args[]){

        // Sample Short Variable
        short A = 10000;
        System.out.println("Short Keyword Example :-"+A);

        //Getting Short Value from Method
        ShortKeywordExample ex = new ShortKeywordExample();
        var sample = ex.getMyShortValue();
        System.out.println("Returned Short Value from getMyShortValue :- "+sample);

        sample = (short) (sample + 4000);
        ex.printShortValue(sample);
    }
}
