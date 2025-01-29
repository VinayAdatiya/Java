package CreatingStream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        //Creating an Empty Stream
        Stream<String> streamString = Stream.empty();
        System.out.println("\nEmpty Stream :- "+streamString+" Empty Stream Count :- "+streamString.count());

        //Create Stream from array
        String[] studentList = {"Vinay","Raj","Harsh"};
        Stream<String> studentStreamArray = Arrays.stream(studentList);
        System.out.println("Stream of String Array using Array.stream() :- ");
        studentStreamArray.forEach(System.out::println);
        Stream<String> studentStream = Stream.of(studentList);
        System.out.println("Stream of String Array Stream.of() :- ");
        studentStream.forEach(System.out::println);

        //Creating Stream From list
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> streamInteger = listInteger.stream();
        System.out.print("\nList of Integer into Stream :- ");
        streamInteger.forEach(i-> System.out.print(" "+i));



        //Set to Stream
        //HashSet
        Set<Integer> setInteger = new HashSet<>(Arrays.asList(1,2,5,3,4));
        Stream<Integer> streamSetInteger = setInteger.stream();
        System.out.print("\nHashset to Stream :- ");
        streamSetInteger.forEach(i-> System.out.print(i+" "));
        //TreeSet
        Set<String> setString = new TreeSet<>(Arrays.asList("Vinay","Raj","Harsh","Krushit"));
        Stream<String> streamSetString = setString.stream();
        System.out.print("\nTree set to Stream :- \n");
        streamSetString.forEach(System.out::println);

        //Map to Stream
        System.out.println("-----Map to Stream using entrySet-----");
        Map<Integer,String> mapStudent = new HashMap<>();
        mapStudent.put(1,"Vinay");
        mapStudent.put(2,"Raj");
        mapStudent.put(3,"Harsh");
        Stream<Map.Entry<Integer,String>> entryStream = mapStudent.entrySet().stream();
        entryStream.forEach(entry -> System.out.println("Key :- "+entry.getKey()+" || Value :- "+entry.getValue()));

        System.out.println("\nKey Stream From Map :- ");
        Stream<Integer> keyStream = mapStudent.keySet().stream();
        keyStream.forEach(i-> System.out.print(i+" "));

        System.out.println("\nValue Stream From Map :- ");
        Stream<String> valueStream = mapStudent.values().stream();
        valueStream.forEach(i-> System.out.print(i+" "));

        // Primitive Type Streams
        IntStream stream1 = IntStream.range(0,11);
        System.out.println("\nStream using IntStream: ");
        stream1.forEach(System.out::println);

        double[] doubles = {1.0,2.2,2.5,4.32};
        System.out.println("\nStream using DoubleStream: ");
        DoubleStream stream2 = Arrays.stream(doubles);
        stream2.forEach(System.out::println);

        //Infinite Stream
        System.out.println("\nInfinite Stream using generate() :- ");
        Stream<String> stream3 = Stream.generate(()->"Value").limit(3);
        stream3.forEach(System.out::println);

        System.out.println("\nInfinite Stream using iterate() :- ");
        Stream<Integer> stream4 = Stream.iterate(0,n->n+1).filter(n->n%2==0).limit(10);
        stream4.forEach(System.out::println);

        //Parallel Stream
        System.out.println("-----Parallel Stream-----");
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> streaml1 = l1.parallelStream();
        System.out.println("using .parallelStream()");
        streaml1.forEach(System.out::println);

        System.out.println("using .stream().parallel()");
        Stream<Integer> streaml2 = l1.stream().parallel();
        streaml2.forEach(System.out::println);
    }
}
