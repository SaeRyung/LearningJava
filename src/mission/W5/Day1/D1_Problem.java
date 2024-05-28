package mission.W5.Day1;

import java.util.Arrays;

public class D1_Problem {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int arr1_len  = arr1.length;
        int targetLen = 1;

        while(targetLen < arr1_len){ //거듭제곱 길이 구하기
            targetLen *= 2;
        }

        int[] result1 = new int[targetLen]; //answer 배열 생성 후 targetLen 길이의 0 넣기
        Arrays.fill(result1,0); //배열 안에 값 0으로 채우기

       System.arraycopy(arr1, 0, result1, 0, arr1_len);


        System.out.println(targetLen);
        System.out.println(Arrays.toString(result1));
    }
}
