package exercise.chapter_13;

public class ImplicitCasting1 {

    public static void main(String[] args) {
        //덜 정밀한 자료형 -> 더 정밀한 자료형
        float myFloat = 5.0f;
        //int myInt = myFloat; float가 더 정밀한 자료형이기 때문에 대입 불가

        //사이즈 작은 type -> 큰 type
        int myInt = 10;
        long myLong = myInt;

        System.out.println(myLong);
    }
}
