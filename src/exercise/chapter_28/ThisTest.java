package exercise.chapter_28;
//this 테스트 하기 위한 실행 클래스
public class ThisTest {

    public static void main(String[] args){
        //person을 세가지 방법으로 만들기

        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호", "Male" );
        Person person3 = new Person("아이유", "Female", 30);

//        person1.showMyself();
//        person2.showMyself();
//        person3.showMyself();

        //객체 자체로 내 자신을 호출
        Person person11 = person1.returnMySelf();
        Person person22 = person2.returnMySelf();
        //결과값
        System.out.println(person11);
        System.out.println(person22);

    }
}

