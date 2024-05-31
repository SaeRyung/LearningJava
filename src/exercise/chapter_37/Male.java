package exercise.chapter_37;


//한사람 여러개 롤 가지기 가능, 클래스와추상클래스는 하나만 상속 가능, implements 여러개 가능
public class Male implements HusbandRole, DaddyRole, EmployeeRole{
    private String name;
    private int age;
    private String job;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 열심히 교육하고 있습니다.");

    }
///////////////////////////////////////////////
    @Override
    public void workTogether(EmployeeRole employeeRole) {
        //Q. 왜 educateBaby와 달리 Male에서 getName을 하나요?
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다.");

    }

    @Override
    public String getName() {
        return this.name;
    }
////////////////////////////////////////////////
    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + "인 아내를 성심성의껏 케이합니다.");

    }

    @Override
    public void sayLoveEvery() {
        System.out.println("우리 가족 사랑합니다");

    }
}
