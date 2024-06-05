package exercise.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        //CharArray - String 관계
        char[] chars = {'a', 'b', 'c'};


        //String 변환
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        //Str -> Chararray 바꾸기
        char[] char2 = str1.toCharArray();
        for(char ch: char2){
//            System.out.println(ch);
        }
        //각 첫번째 인덱스에 맞는 값을 출력
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
    }
}
