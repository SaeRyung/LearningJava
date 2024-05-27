package exercise.chapter_24;

public class Scores {
    public static void main(String[] args){
        //A class 학생들 점수
        int std_Aclass1 = 50;
        int std_Aclass2 = 30;
        int std_Aclass3 = 45;

        //B class 학생들 점수
        int std_Bclass1 = 60;
        int std_Bclass2 = 65;
        int std_Bclass3 = 66;

        //Average
        int sum_Aclass = std_Aclass1 + std_Aclass2 + std_Aclass3;
        double avg_Aclass = sum_Aclass / (double)3; //소수점 얻으려면 명시적 변환

        //B class
        //괄호 안 인자값 넣기
        double avg_Bclass = calculateAvg(std_Bclass1, std_Bclass2, std_Bclass3);


        //.2는 반올림하여 둘째자리까지 결과값
        System.out.printf("A학급의 평균 점수는 %.2f, B학급의 평균 점수는 %.2f\n",avg_Aclass,avg_Bclass);

    }

    //메소드로 결과값
    //반환값 먼저 정의
    static double calculateAvg(int stdScore1, int stdScore2, int stdScore3){
        //실제 명령어
        int sum_Bclass = stdScore1 + stdScore2 + stdScore3;
        //반환값
        return sum_Bclass / (double)3;
    }

}
