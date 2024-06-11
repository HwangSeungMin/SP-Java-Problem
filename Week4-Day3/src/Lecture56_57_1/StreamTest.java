package Lecture56_57_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // Stream.of
        Stream<String> fruits  = Stream.of("Apple","Banana","Orange");
        Stream<Integer> integerSream = Stream.of(1, 2, 3, 4, 5);

        //Arrays.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple","Banana","Orange"});
        Stream<Integer> integersStream2 = Arrays.stream(new Integer[]{1,2,3,4,5});

        //Collection
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Apple");
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        Stream<String> fruits3 = fruitsList.stream();

        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);
        integersList.add(5);

        Stream<Integer> integersStream3 = integersList.stream();


        //Stream & For-loop
        for(String fruit:fruitsList){
            System.out.println(fruit.toUpperCase());
        }

        fruits3.forEach( (fruit) -> System.out.println(fruit.toUpperCase()));

        for(Integer integer:integersList){
            if(integer %2 == 0) System.out.println(integer);
            else continue;
        }

        integersStream3.filter( i -> i%2==0 ).filter( i-> i>3 ).forEach( (i) -> System.out.println(i.toString()));

        Set<String> fruitSet = fruitsList.stream().collect(Collectors.toSet());
        System.out.println("fruitSet : "+fruitSet);


        Optional<String> fruitOptional = fruits.findFirst();
        System.out.println("optional fruit : " + fruitOptional.orElseGet(() -> "기본 과일"));

        System.out.println("Sum : " + integersList.stream().mapToInt(i->i).sum());
        System.out.println("Avg : " + integersList.stream().mapToInt(i->i).average());

        System.out.println("Length : " + integersList.stream().count());
        System.out.println("Max : " + integersList.stream().mapToInt(i->i).max());
        System.out.println("Min : " + integersList.stream().mapToInt(i->i).min());
        // reduce 소모값(?) 초기값 int , 연산
        int result = integersList.stream().reduce(0,(integer, integer2) -> integer - integer2);
        System.out.println(result);
    }
}
