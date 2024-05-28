package exercise.chapter_27.packageOne;

public class ClassAA {

    void testPublic(ClassA classA){ //classA 인자를 받음
        String str = classA.publicStr; //문법이상없으면 접근 가능
        classA.methodPublic();
    }

    void testPrivate(ClassA classA){
    }


    void testDefault(ClassA classA){
        String str = classA.defaultStr;
    }
}
