package exercise.chapter_18;

public class Operator {
    public static void main(String[] args){

        //대입연산자 +=, *=
        int myInt = 5;
        myInt *= 1;
        System.out.println(myInt);

        //단항연산자 ++
        int myInt2 = 10;
        //myInt2++;

        //보통 결과값에 넣는 경우 많음
       // System.out.println(myInt2++); //10
        System.out.println(++myInt2); //11
    }
}
