package mission.Day4;

public class Day4_1 {
    public static void main(String[] args){

        int age = 30;

        String age_0 = "유아 관람불가";
        String age_12 = "전체 관람가";
        String age_15 = "12세 이상 관람가";
        String age_19 = "15세 이상 관람가";
        String age_20 = "청소년 관람 불가";

        if(age<0){
            System.out.println(age_0);
        }
        else if(0<=age && age<12){ //전체관람가
            System.out.println(age_12);
        }
        else if(12<=age && age<15){ //12세 이상 관람가
            System.out.println(age_15);
        }
        else if(15<=age && age<19){ //15세 이상 관람가
            System.out.println(age_19);
        }
        else{ // 청소년 관람 불가
            System.out.println(age_20);
        }
    }
}
