package exercise.chapter_27.packageOne;

public class ClassA {
    //public
    public String publicStr;


    //private
    private String privateStr;

    //default
    String defaultStr; //앞에 정의 안하면 됌

    public void methodPublic(){};

    private void methodPrivate(){};

    void testPrivate(){ //자신 안에서는 private 접근 가능
        String str = privateStr;
    }
}
