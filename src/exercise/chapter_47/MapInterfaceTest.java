package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args) {
        //Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        //Map에 데이터 넣기
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap: " + fruitMap);

        //Get(key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("appleCount: " + appleCount);
        System.out.println("bananaCount: " + bananaCount);

        //conains(key)
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("Apple 존재: "+ isApple );
        System.out.println("Mange 존재: "+ isMango );

        //remove(key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap: " + fruitMap);


        //size
        System.out.println("fruitMap size : " + fruitMap.size());


        //KeySet()
        System.out.println("fruitMap keySet : " + fruitMap.keySet());
    }
}
