package TerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(
                Arrays.asList("Vinay","Krushit","Vikas","Arpan","Raj","Jay")
        );

        // 1. forEach()
        System.out.println("List of name printing using Stream API forEach() :- ");
        name.stream().forEach(System.out::println);

        // 2. collect()
        List<String> startsWithV = name.stream().filter(n -> n.startsWith("V")).collect(Collectors.toList());
        System.out.println("all the list members starting with V :- "+startsWithV);

        // 3. reduce()
        String mergedNames = name.stream().reduce((s, s2) -> s+" "+s2).orElse(null);
        System.out.println("Combined Names Using reduce() :- "+mergedNames);

        String longestWord = name.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2).orElse(null);
        System.out.println("LongestWord :- "+longestWord);

        // 4. count()
        System.out.println("Count of members in the list :- "+name.stream().count());

        // 5. findFirst()
        System.out.println("First element into the member list :- "+name.stream().findFirst());

        // 6. anyMatch()
        System.out.println("anyMatch on the name list :- "+name.stream().anyMatch(s -> s.startsWith("V")));

        // 7. allMath()
        System.out.println("allMatch on the name list :- "+name.stream().allMatch(s -> s.startsWith("V")));
    }
}
