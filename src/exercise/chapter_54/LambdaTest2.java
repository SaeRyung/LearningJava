package exercise.chapter_54;

public class LambdaTest2 {

    public static void main(String[] args){
        MultipleNum multipleNum = num -> num * 1;

        int i = 100;

        StringNum stringNum2 = (str, num) -> {
            //외부에 있는것 읽는것은 가능하나 수정은 안됌
            //i = 200; X
            System.out.println("i:" + i);
            for(int i1 = 0; i1 <num; i1++){
            }
            System.out.println("stringNum2:" +str);

        };
    }
}
