package exercise.chapter_53;

public class OuterClassTest1 {
    public static void main(String[] args) {
        //일반 중첩 클래스
        //1. 외부 먼저 만들기
        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);

        innerClass1.display();

        //정적 중첩 클래그
        //static은 class가 인스턴스화 되기 전 만들어져있어서 호출 가능.
        //
        OuterStaticClass outerStaticClass = new OuterStaticClass(10);

        OuterStaticClass.InnerClass innerClass2 = new OuterStaticClass.InnerClass(20);

        innerClass2.display();

    }
}
