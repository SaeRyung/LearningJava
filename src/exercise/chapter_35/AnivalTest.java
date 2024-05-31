package exercise.chapter_35;

public class AnivalTest {

    public static void main(String[] args){
        //왼 타입 오 실체(=인스턴스), 실제 인스턴스 행동에 따라 결과값이 달라진다.
//        Animal animal1 = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

//        feed(animal1, "빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "고기");

    }

    //Animal의 먹는다 함수 추가
    public static void feed(Animal animal, String food){
        animal.eat((food));
    }
}
