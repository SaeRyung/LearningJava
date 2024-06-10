package exercise.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작합니다.");

       // makeUncheckException();
        makeCheckedException();

        System.out.println("메인 메소드가 종료합니다.");
    }

    public static void makeUncheckException(){
        //array 초과 선택 시
        int[] intArr = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        int index = 10;

        System.out.println("intArr값: "+intArr[index]);
    }

    //File
    //throws FileNotFoundException : 예외미루기
    public static void makeCheckedException() throws FileNotFoundException {
        File file = new File("exercise/chapter_50/test.txt");
        //FileInputStream ; 파일을 읽는것 > checkedexception 강제 처리.
        FileInputStream fs = new FileInputStream(file);

        System.out.println("Fs 실행됩니다.");
    }
}
