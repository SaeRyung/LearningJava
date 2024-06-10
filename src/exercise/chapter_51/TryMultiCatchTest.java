package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args){
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt");

            int i = 0;
            int data = 100/i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);


            //catch (Exception e) > 맨 앞에 두면 어떤 에러도 Exception에 걸림
        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("ArithmeticException 또는 NullPointerException 이 발생");
            e.printStackTrace();
        } catch (Exception e){ //최종필터, 어떤 에러가 나오더라도 걸릴 수 있도록, Exception 모든 예외처리 포괄문법
            System.out.println("최종 Exception 필터에 걸렸다.");
        }
//        catch (NullPointerException e){
//            System.out.println("NullPointerException 이 발생");
//            e.printStackTrace();
//       }



        System.out.println("메인메소드 종료");
    }
}
