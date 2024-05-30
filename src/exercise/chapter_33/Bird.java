package exercise.chapter_33;

public class Bird extends Animal{
    //속성
    private long weight;
    private String color;

    //행위

    @Override
    public void eat(String food) {
//        super.eat(food); //부모 클래스 부르는것, 안씀.
        System.out.printf("새가 %s를 부리로 쪼아 먹고 있습니다.\n", food); //재정의
    }

    @Override
    public void sleep() {
        //재정의
        System.out.println("새가 잠을 자고 있습니다.");
    }

    public void fly(){
        System.out.println("새가 날고 있습니다.");
    }
}
