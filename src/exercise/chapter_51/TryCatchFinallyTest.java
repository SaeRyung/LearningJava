package exercise.chapter_51;

public class TryCatchFinallyTest {

    public static void main(String[] args){

        System.out.println("/////메인 메소드 실행//////");

        try{
            Integer myInt = 14;
            Integer data = 100/myInt;

            if(myInt == 14) return;

            System.out.println("data: " + data);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException에러: MyInt는 0이 될 수 없다");
            e.printStackTrace();
        }finally {
            System.out.println("여기는 무조건 실행되는 Finally 영역"); //에러 잡을때, 안잡을때, 정상실행 무조건 finally
        }

        System.out.println("/////메인 메소드 종료/////");
    }
}
