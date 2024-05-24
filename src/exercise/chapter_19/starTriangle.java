package exercise.chapter_19;

public class starTriangle {
    public static void main(String[] args){
//        int star;
//        String arr = "";
//        String ss = "*";
//
//        for(star=1; star<=10; star++){
//            arr = arr + ss;
//            System.out.println(arr);
//
//        }
        //강의
        int row;
        int column;

        for(row=1; row<=9; row++){
            for(column=1; column<=row; column++){
                System.out.print("x"); //println은 엔터를 자동으로 치므로
            }
            System.out.println();
        }
    }
}
