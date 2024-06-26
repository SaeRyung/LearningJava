package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {

        //for loop
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] arr1 = new int[arr.length];

        for(int i =0; i<arr.length; i++){
            arr1[i] = arr[i];
        }

        //깊은복사 방법1
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        //깊은복사 방법2_실무에서 제일 많이 사용
        int[] arr3 = arr.clone();

        arr[0] = 100;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
