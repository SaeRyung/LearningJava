package exercise.chapter_19;

public class ThreeSixNineGame {
    public static void main(String[] args) {
//        for(int i = 1; i <=30; i++){
//            if(i%3 == 0){
//                if(i == 30){
//                    System.out.print("짝");
//                    break;
//                }
//                System.out.print('짝'+",");
//            }
//            else{
//                System.out.print(i+",");
//            }
//        }
        //강의
        for(int num=1; num<=30; num++){
            if(num%3==0){
                System.out.print("짝,");
                continue;
            }
            System.out.printf("%d,",num);
        }
    }
}
