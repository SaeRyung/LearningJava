package exercise.chapter_15;

public class Literal {
    public static void main(String[] args) {
        //이진법
        int num = 0b1010;
        System.out.println(num);

        //16진법
        int num2 = 0xAC0; //12 * 16 + 10 * 16^2 == 2752
        System.out.println(num2);

        double myDouble = 5.22E5; //5.22 * 10^5
        System.out.println(myDouble);

        double myDouble2 = 2.55E-3; //2.55 / 10^3
        System.out.println(myDouble2);

        //null : 아무것도 없다.
        String str = null;
        System.out.println(str);
    }
}
