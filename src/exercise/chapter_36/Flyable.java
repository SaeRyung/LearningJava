package exercise.chapter_36;

public interface Flyable { //Flyable이란 계약서를 작성
    //속성
    long atmosphereLimit = 476;//대기권

    //fly를 구현해야 한다 는 의무가 생김
    default void fly(){
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    };

    static void printLandig(){
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다.");
    }
}
