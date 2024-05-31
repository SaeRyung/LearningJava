package exercise.chapter_37;

//인터페이스 끼리 합칠 수 있다.
//DaddyRole,HusbandRole 합쳐서 default로 구현
public interface FamilyRole extends DaddyRole,HusbandRole{

    @Override
    default void sayLoveEvery() {

        DaddyRole.super.sayLoveEvery();
        HusbandRole.super.sayLoveEvery();
    }
}
