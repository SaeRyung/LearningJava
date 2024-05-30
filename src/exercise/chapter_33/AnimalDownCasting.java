package exercise.chapter_33;

import mission.A;

public class AnimalDownCasting {

    public static void main(String[] args){
        //다운캐스팅 확인 여부
        Animal animal = new Bird();
        Bird bird = (Bird) animal;
        checkBirdAndFly(animal);


        Animal animal2 = new Animal();
//        Bird bird2 = (Bird) animal2; //error
        checkBirdAndFly(animal2);

        Animal animal3 = new Person();
//        Bird bird3 = (Bird) animal3; //error
        checkBirdAndFly(animal3);
    }

    //메소드 추가
    static void checkBirdAndFly(Animal animal){
        if(animal instanceof Bird){
            Bird bird = (Bird) animal; //다운캐스팅
            bird.fly();
        }
        else{
            System.out.println("너는 새가 아니야");
        }
    }
}
