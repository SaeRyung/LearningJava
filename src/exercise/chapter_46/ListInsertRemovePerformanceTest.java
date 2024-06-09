package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {

    static final int SIZE = 100000;

    public static void main(String[] args){

        long startTime;
        long endTime;



        startTime = System.currentTimeMillis();
        //List ArrayList 구현
        List<Integer> integerList_Arr = new ArrayList<>();

        for(int i =0; i<SIZE; i++){
            integerList_Arr.add(i);
            if(i%5 ==0) integerList_Arr.remove(0);
        }

        endTime = System.currentTimeMillis();



        System.out.println("ArrayList 삽입/삭제 요청 걸린 시간: " + (endTime - startTime)+ "ms");


        startTime = System.currentTimeMillis();
        //List LinkedList 구현
        List<Integer>integerList_Linked = new LinkedList<>();

        for(int i=0; i<SIZE; i++){
            integerList_Linked.add(i);
            if(i%5 ==0) integerList_Linked.remove(0);
        }

        endTime = System.currentTimeMillis();


        System.out.println("LinkedList 삽입/삭제 요청 걸린 시간: " + (endTime - startTime)+ "ms");

//        System.out.println("ArrayList: " + integerList_Arr);
//        System.out.println("LinkedList: " + integerList_Linked);
    }


}
