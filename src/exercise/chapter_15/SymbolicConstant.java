package exercise.chapter_15;

public class SymbolicConstant {
    public static void main(String[] args){
        //상수
        final int MY_INY = 5;

        //MY_INY = 10; //상수 변경 불가

        final double MY_DOUBLE; //정의먼저 -> 상자 열어놓은 상태
        MY_DOUBLE = 5.0; //상자에 값 넣기

        //MY_DOUBLE = 10.0; //상수 변경 불가
    }
}
