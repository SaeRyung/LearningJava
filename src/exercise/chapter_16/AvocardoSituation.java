package exercise.chapter_16;

public class AvocardoSituation {
    public static void main(String[] args){
        //장보기 전
        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true; //아보카도 있는가

        //아내장보기
//        milks = 1; //우유 1개 사기
//        if(existedAvocado){
//            avocados = avocados + 6; //아보카도 있으면 6개 사기
//        }

        //남편장보기
//        if(existedAvocado){
//            milks = 6;
//        }
//        else{
//            milks = 1;
//        }

        //남편 장보기 - 삼항연산자
        milks = (existedAvocado) ? 6 : 0;

        //집으로 돌아오기
        String comment = String.format("아내야, 장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어", avocados, milks);

        System.out.println(comment);
    }
}
