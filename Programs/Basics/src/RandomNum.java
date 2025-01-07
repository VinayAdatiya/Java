import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random obj = new Random();
        System.out.println("Random Integer Number :- "+obj.nextInt(50,100));
        System.out.println("Random Double Number :- "+obj.nextDouble(50,100));
        System.out.println("Random Long Number :- "+obj.nextLong(50,100));
        System.out.println("Random Float Number :- "+obj.nextFloat(50,100));
        System.out.println("Random Boolean Number :- "+obj.nextBoolean());
    }
}
