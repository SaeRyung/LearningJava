package exercise.chapter_28;
//생성자가 오버로딩 할 때 다른 생성자 this를 호출할 수 있는지 테스트
public class Person {
    //
    private String name;
    private String gender;
    private int age;

    public void showMyself(){
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n", this.name, this.gender, this.age); //메소드 만듬
    }

    //바로 아래 파라미터가 하나 더 많은 생성자를 호출하도록 만듬.

    public Person(String name){
        this(name, "unknown");
    }


    public Person(String name, String gender){
        this(name, gender,-1);
    }


    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person returnMySelf(){
        return this; //나 자신을 인스턴스로 보낸다.
    }
}
