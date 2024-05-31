package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args){
        //Male 3개; 남편, 아빠, 회사원
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");

        //남편역할
        male.sayLoveEvery();
        male.takeCareWife(wife);
    }
}
