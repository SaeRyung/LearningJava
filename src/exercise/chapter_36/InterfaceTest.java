package exercise.chapter_36;

public class InterfaceTest {

    public static void main(String[] args){

        //static 아니여도  추가!
        System.out.println(Flyable.atmosphereLimit);
//        Flyable.atmosphereLimit = 100; //error, final로


        //Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB111");

        //Flyable에만 선언된 타입을 실행할 수 있다.
        bird.fly();
        airplane.fly();

///////////////////Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("아이유");

        Walkable robot = new Robot("RB123123");

        person.walk();
        robot.walk();

        //다운캐스팅_처음에 if문으로 검사 하는게 안전하다
        if(robot instanceof Robot){
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }

    }


}
