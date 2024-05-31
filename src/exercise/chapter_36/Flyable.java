package exercise.chapter_36;

public interface Flyable { //Flyable이란 계약서를 작성
    //속성
    long atmosphereLimit = 476;//대기권

    //fly를 구현해야 한다 는 의무가 생김
    void fly();
}
