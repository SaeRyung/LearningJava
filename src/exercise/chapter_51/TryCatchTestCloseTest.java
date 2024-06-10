package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTestCloseTest {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("///////메인 메소드 실행//////");

//
        try (FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt")) {

            int i;
            while ((i=fs.read()) != -1){
                System.out.write(i);
            }

            int myInt = 0;
            int data = 100/myInt;

            //컴퓨터에게 끝났다고 알려줌
            //fs.close();


        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼습니다.");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없다.");
        }


        System.out.println("///////메인 메소드 종료//////");

        //무한루프생성
        while(true){
            Thread.sleep(1000);
        }
    }
}
