package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args){
        //
        int[] studentScores = {90, 87, 88, 75, 99, 65};

        //for loop
        for(int i=0; i<studentScores.length; i++){
            System.out.printf("이 Array의 %d 의 인덱스의 값은 %d 이다.\n", i, studentScores[i]);
        }
        //for loop 와 array 궁합 좋다.
        //강화된 for문
        for(int score: studentScores){
            System.out.printf("student의 값은 %d 이다.\n", score);
        }
    }
}
