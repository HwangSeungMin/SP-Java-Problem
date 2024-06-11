package Lecture56_57_1;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {

    public static void main(String[] args) {
        String str = "abc";
        str=null;

        Optional<String> stringOptional = Optional.ofNullable(str);
        Supplier<String> stringSupplier = () -> "null";
        String str2 = stringOptional.orElseGet(stringSupplier)
                .toUpperCase();

        System.out.println(str2);
    }
}
