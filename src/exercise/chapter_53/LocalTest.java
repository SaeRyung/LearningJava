package exercise.chapter_53;

public class LocalTest {
    public static void main(String[] args) {

        class LocalWalk implements Walkable{

            @Override
            public void walk() {
                System.out.println("LocalWalk: Walking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;

        //익명클래스
        Walkable anonymousWalk = new Walkable() {

            @Override
            public void walk() {
                //i=200; 접근은 가능하나 수정은 안됌
                System.out.println("i: " + i); //선언이면서 접근
                System.out.println("AnonymousWalk: Walking");
            }
        };

        anonymousWalk.walk();
    }
}
