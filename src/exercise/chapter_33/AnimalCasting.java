package exercise.chapter_33;

public class AnimalCasting {

    public static void main(String[] args){
        Animal[] animals = {
                new Animal(), new Person(), new Person(), new Fish(), new Bird(),
                new Person(), new Fish(), new Fish(), new Bird(), new Animal()
        };

        sleepTogether(animals);
        System.out.println("______________________________");

        doSomethingSeparately(animals);

    }

    //메서드
    static void sleepTogether(Animal[] animals){
        for(Animal animal: animals){
            animal.sleep();
        }
    }
    
    static void doSomethingSeparately(Animal[] animals){
        for(Animal animal: animals){
            if(animal instanceof Bird){
                //다운캐스팅
                Bird bird = (Bird) animal;
                bird.fly();

            } else if (animal instanceof Fish) {
                //다운캐스팅
                Fish fish = (Fish) animal;
                fish.swim();
                
            } else if (animal instanceof Person) {
                //다운캐스팅
                Person person = (Person) animal;
                person.walk();

            } else{
                System.out.println("동물 클래스이거나 지원하지 않는 객체입니다.");
            }

        }
    }
}
