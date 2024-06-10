package exercise.chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String password = "q1w2e3";
        String hashPassword = hashString(password);

        System.out.println("패스워드 원본: "+password);
        System.out.println("패스워드 해시: "+hashPassword); //고유화, 암호화 특징


        //Data 검색을 위한 Hash
        //Objects.hashCode: 고유 정수값으로 나온다
        long hashCode = Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2244);

        //내부클래스의 해시코드 호출 > 1000으로 출력된다
        long hashCode3 = Objects.hashCode(new Customer("민철"));
        long hashCode4 = Objects.hashCode(new VIPCustomer("아이유"));

        System.out.println("hashCode: " + hashCode);
        System.out.println("hashCode2: " + hashCode2);
        System.out.println("hashCode3_Customer: " + hashCode3);
        System.out.println("hashCode4_VIPCustomer: " + hashCode4);


        //다른객체, 해쉬코드는 같다. customerID 기준이기 때문, 다르게 하면 다르게 설정된다.
        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = new Customer("ID2", "민철");

        long hashCodeCustomer1 = Objects.hashCode(customer1);
        long hashCodeCustomer2 = Objects.hashCode(customer2);
        System.out.println("첫번째 hashCodeCustomer1: " + hashCodeCustomer1);
        System.out.println("두번째 hashCodeCustomer2: " + hashCodeCustomer2);
    }

}



