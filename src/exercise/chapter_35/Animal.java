package exercise.chapter_35;

//추상화 클래스
public abstract  class Animal {
    //속성
    protected String gender; //자식들에게 공유 > protected

    //행위
    //구현했던 동작들 지우기.
    public abstract void eat(String food);

    public abstract void sleep();
}
