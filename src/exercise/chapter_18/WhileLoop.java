package exercise.chapter_18;

public class WhileLoop {
    public static void main(String[] args) {
        //1~10까지 다 더하는 while loop
        int sum = 0;
        int num = 0;
        while(num < 10){ //가로 안에 조건문, 조건문이 만족하는 한 계속 실행된다. false일때 반복문 종료
            num = num + 1;
            sum = sum + num;
        }
        String result = String.format("모든 수를 더한 값은 %d 입니다.", sum);
        System.out.println(result);
    }


}
