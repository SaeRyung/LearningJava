package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {

    public static void main(String[] args){

        System.out.println("메인 메소드 실행");

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("Love");
        stringList.add(null); //null은 값이 아니기에 toUpperCase 실행 X
        stringList.add("Coding");

        for(int i =0; i<stringList.size()+5; i++){

            try{
                System.out.println("i: " + i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase()); //대문자로 출력
            }catch (NullPointerException e){
                System.out.println("null은 들어갈 수 없습니다.");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Index는 Array Bound를 넘어갈 수 없습니다.");
                break; //반복문 break시 for문 나가기
            }

        }

        System.out.println("메인 메소드 종료");
    }
}
