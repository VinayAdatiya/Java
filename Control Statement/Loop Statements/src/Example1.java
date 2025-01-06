public class Example1 {
    public static void main(String args[]){
        //Example of for loop
        int sum = 0;
        for(int j=0;j<=10;j++){
            sum += j;
        }
        System.out.println("The sum of first 10 natural numbers :- "+sum);

        //Example of for-each loop
        String[] names = {"java","python","c","c++"};
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("While loop");
        //Example of while loop
        int i=0;
        System.out.println("Even numbers till 10");
        while(i<=10){
            if(i%2 == 0){
                System.out.println(i);
            }
            i+=1;
        }

        //Example of do while
        System.out.println("Do While Statement");
        System.out.println("Even numbers till 10 using do while");
        i =0;
        do{
            System.out.println(i);
            i+=2;
        }while(i<=10);

        System.out.println("Break Statement Without Label");
        //Example of break statement
        for(int j=0;j<=2;j++){
            for(int k=0;k<=5;k++){
                System.out.println(k);
                if(k==2){
                    break;
                }
            }
        }

        //Example of continue statement
        System.out.println("Continue Statement");
        for(int a =0 ; i<=2;i++){
            for(int b=0;b<3;b++){
                if(b==1 || b==2){
                    continue;
                }
            }
        }

    }
}
