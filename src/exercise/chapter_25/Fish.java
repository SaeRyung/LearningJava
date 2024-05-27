package exercise.chapter_25;

public class Fish {
    //속성
    String sex; //"Male", "Female"
    boolean havingPoison; // true 독 있다, false 독 없다
    String startSpawningDate; //산란시작시간
    String endSpawningDate; //산란 종료시간
    String leavingSea; //사는 속성

    //행위

    //반환값 없을때 void 정의. 메소드 이름 eat
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    };
    void swim(int meter){
        System.out.println("나는 헤엄칩니다 미터: " + meter );
    }

    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(){};
}
