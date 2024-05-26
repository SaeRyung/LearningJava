package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArrayCopy {
    public static void main(String[] args){

        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        //clone는 2차배열에서 깊은복사X
        int[][] arr1 = arr.clone();

        int[][] arr2 = new int[3][]; //row설정 해야함
        for(int row=0; row<3; row++){
            arr2[row] = arr[row].clone(); //clone이 한 row만 가능하여 하나하나 해줘야함
        }


        arr[0][0] = 100;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1)); //얕은복사
        System.out.println(Arrays.deepToString(arr2)); //깊은복사


    }
}
