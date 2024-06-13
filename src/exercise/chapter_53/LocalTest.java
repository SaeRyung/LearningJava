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
    }
}
