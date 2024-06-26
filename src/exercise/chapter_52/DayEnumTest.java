package exercise.chapter_52;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args){
        //각각 ENum 값 정의
        //Ordinal, compareTo, values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        //Ordinal 순서 값 출력
        System.out.println("ordinal 값: " + monday.ordinal());
        System.out.println("ordinal 값: " + sunday.ordinal());
        System.out.println("ordinal 값: " + thursday.ordinal());

        //compareTo
        System.out.println("compareTo 값: " + monday.compareTo(sunday));
        System.out.println("compareTo 값: " + monday.compareTo(thursday));

        //class 메소드
        Day[] days = Day.values();
        System.out.println("Days: " + Arrays.toString(days));

    }
}
