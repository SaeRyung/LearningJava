package exercise.chapter_37;

//철수를 하나 더 만든다, => 민철이
public class MaleTwo extends FamilyMan implements FamilyRole, EmployeeRole{
//    @Override
//    public void educateBaby(Baby baby) {
//
//    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다.");

    }

//    @Override
//    public void takeCareWife(Wife wife) {
//
//    }

    @Override
    public String getName() {
        return this.name;
    }


//    @Override
//    public void sayLoveEvery() {
//        FamilyRole.super.sayLoveEvery();
//    }


    public MaleTwo(String name) {
        this.name = name;
    }
}
