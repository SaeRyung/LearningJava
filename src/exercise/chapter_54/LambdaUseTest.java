package exercise.chapter_54;

public class LambdaUseTest {
    public static void main(String[] args){
        MultipleNum multipleNum = (num) -> num * 10;
        MultipleNum multipleNum2 = (num) -> num * 20;

       // printNum(multipleNum2);

        //실제 실무에서 많이 쓰임
        //printNum((x) -> x * 100);

        //Generic
        GenericLambda<String> genericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> genericLambda3 = (myBool) -> myBool & true;

       System.out.println(genericLambda1.calculate("abc"));
       System.out.println(genericLambda2.calculate(100));
        System.out.println(genericLambda3.calculate(true));


    }
    //다른메소드 정의 후 메소드 인자 넣기
    static void printNum(MultipleNum multipleNum){
        int result = multipleNum.calculate(5);

        System.out.println(result);
    }
}
