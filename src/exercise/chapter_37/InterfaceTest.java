package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args){
        //Male 3개; 남편, 아빠, 회사원

        //남편역할
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");


        male.sayLoveEvery();
        male.takeCareWife(wife);


        //아빠역할
        //같은 객체, 타입만 바꾼것
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEvery();


        //회사원
        EmployeeRole maleEmployeeRole = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeTwo = new MaleTwo("민철");

        maleEmployeeRole.workTogether(maleEmployeeTwo);

    }
}
