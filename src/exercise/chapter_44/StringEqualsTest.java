package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2); //메모리주소 비교
        System.out.println(str1.equals(str2)); //값 비교

        String str3 = new String("Cat");
        String str4 = new String("Cat");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }

}
