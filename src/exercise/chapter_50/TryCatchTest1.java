package exercise.chapter_50;

public class TryCatchTest1 {

    public static void main(String[] args){
        System.out.println("메인 메소드 실행합니다.");

        try{
            int i = 10;
            int data = 50/i;

            System.out.println("data: " + data);
        } catch (ArithmeticException e) {

            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("data: " + 0);
            e.printStackTrace(); //에러 자세히 볼 수 있다
        }




        System.out.println("메인 메소드 종료합니다.");
    }
}
