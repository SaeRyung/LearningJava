package exercise.chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        //int []
        int[] intArr = new int[10]; //기본값_int의 기본값은 0이기때문에 0이 10개 출력됌
        int[] intArr2 = new int[]{1, 2, 3, 4, 5}; //선언과 동시에 값 넣기(=초기화)
        int[] intArr3 = {1, 2, 3, 4, 5}; //intArr2 == intArr3

        //array 메모리값으로 출력됌
        System.out.println(Arrays.toString(intArr)); //배열 내부 볼 수 있는 기능
        System.out.println(Arrays.toString(intArr2));

        //float[]
        float[] floatArr = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 3.5f};

        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(floatArr2));

        //boolean
        boolean[] booleans = new boolean[5]; //boolean 기본값은 false
        boolean[] booleans1 = {true, false, true};

        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(booleans1));

        //char String
        char[] charArr = new char[10]; //기본은 아스키코드
        char ch = 0;
        char[] charArr2 = {'A','B','V'};
        String[] stringArr = new String[10]; //String은 레퍼런스 타입 -> 기본은 null, class때 배울 예정
        String[] stringArr2 = {"ABC","Hello","World"};

        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(charArr2));
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArr2));
    }
}
