package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args) {
        //List 정의
        List<String> fruitList = new ArrayList<String>();

        //add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        //내부적으로 toString
        System.out.println("FruitList 요소: " + fruitList);

        //add(index, element)
        fruitList.add(3, "Mango");
        System.out.println("FruitList 요소: " + fruitList);

        //remove(index)
        fruitList.remove(3);
        System.out.println("FruitList 요소: " + fruitList);

        //get(index)
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은: " + myFruit);

        //set(index, Element)
        fruitList.set(1, "PineApple");
        System.out.println("과일 요소 바꾸기: "+fruitList);

        //size
        System.out.println("리스트 사이즈: "+ fruitList.size());

        //isEmpty: 현재 리스트 비었는지 안비었는지 확인
        List<String> fruitList2 = new ArrayList<>();
        System.out.println("배열 비었는지 확인: "+fruitList.isEmpty());
        System.out.println("배열 비었는지 확인: "+fruitList2.isEmpty());

        //Contains: 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println("존재확인: "+ fruitList.contains("Kiwi"));
        System.out.println("존재확인: " + fruitList.contains("Apple"));

        //indexOf; 존재시0 없으면 -1, Clear: 전부삭제
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println(fruitList);

    }
}