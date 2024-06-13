package exercise.chapter_54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {
    public static void main(String[] args){
        String str = null;
        //nullpoint 피하기, null이면 기본값을 출력
        Optional<String> stringOptional = Optional.ofNullable(str);

        //Supplier<String> stringSupplier = () -> "default";
        String str2 = stringOptional.orElseGet(() -> "default").toUpperCase();

        System.out.println(str2);
    }


}
