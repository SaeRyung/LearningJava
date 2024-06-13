package exercise.chapter_54;

//람다식 지원 위해 명시
@FunctionalInterface
public interface MultipleNum {
    int calculate(int num);

   // int calculate2(int num2); 메소드 하나만 필요하다 , 사용X
}
