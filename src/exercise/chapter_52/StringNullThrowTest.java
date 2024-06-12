package exercise.chapter_52;

public class StringNullThrowTest {

    public static void main(String[] args) {
        try {
            String str = null; //null값
            System.out.println(str.length());
        } catch (NullPointerException e) { //null값 캐치
            throw new CustomException("CustomException이 발생했습니다.");
        }
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
