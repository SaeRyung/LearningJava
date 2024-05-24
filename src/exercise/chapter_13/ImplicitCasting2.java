package exercise.chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args) {

        // + * 사칙연산
        int myInt = 10;
        double myDouble = 55.1;
        double result = myInt + myDouble;
        System.out.println(result);

        int myInt2 = 10;
        long myLong = 20L;
        long result2 = myInt2 * myLong;
        System.out.println(result2);
    }
}
