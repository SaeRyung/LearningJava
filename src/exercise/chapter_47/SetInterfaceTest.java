package exercise.chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        //set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        //Add
        //set은 순서가 중요하지 않기에 순서 랜덤
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruitSet: " + fruitSet);

        //중복 add X
        //List<String> fruitList = new ArrayList<>(); > 가능
//        fruitSet.add("Apple");
        fruitSet.add("Melon");
        System.out.println("fruitSet: " + fruitSet);

        //remove(Set)
        fruitSet.remove("Apple");
        System.out.println("fruitSet: " + fruitSet);

        //container
        System.out.println("Apple 있는지 : " + fruitSet.contains("Apple"));
        System.out.println("Mango 있는지 : " + fruitSet.contains("Mango"));

        //Size, isEmpty, Clear
        System.out.println("fruitSet size: " + fruitSet.size());
        fruitSet.clear(); //비우기
        System.out.println(fruitSet.isEmpty());
        System.out.println("fruitSet: " + fruitSet);
    }
}
