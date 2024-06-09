package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {

    static final int SIZE = 10000;

    public static void main(String[] args){

        //List ArrayList 구현
        List<Integer> integerList_Arr = new ArrayList<>();

        for(int i =0; i<SIZE; i++){
            integerList_Arr.add(i);
        }


        //List LinkedList 구현
        List<Integer>integerList_Linked = new LinkedList<>();

        for(int i=0; i<SIZE; i++){
            integerList_Linked.add(i);
        }

//        System.out.println("ArrayList: " + integerList_Arr);
//        System.out.println("LinkedList: " + integerList_Linked);


        long startTime;
        long endTime;

        ////////////////ArrayList 시간
        startTime = System.currentTimeMillis();

        for(int i =0; i<SIZE; i++){
            integerList_Arr.get(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("ArrayList Get 요청 걸린 시간: " + (endTime - startTime)+ "ms");


        ///////////////LinkedList 시간
        startTime = System.currentTimeMillis();

        for(int i =0; i<SIZE; i++){
            integerList_Linked.get(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("LinkedList Get 요청 걸린 시간: " + (endTime - startTime) + "ms");
    }
}
