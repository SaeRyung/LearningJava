package exercise.chapter_32.fish;

public class seaSituation {

    public static void main(String[] args) {
//        //자식 물고기
//        FishChild fishChild = new FishChild();
//
//        //부모 물고기가 만들어지고... 자식 물고기가 만들어지고...먼저 출력됌
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//
//        fishChild.printMyInfo();
//
//        //생성자 오버로딩
//        FishChild fishChild2 = new FishChild("Female", true, "서해");
//        fishChild2.printMyInfo();

        //super
        //생성자 오버로딩
//
//        FishChild fishChild = new FishChild(true, "서해");
//        fishChild.printMyInfo();

//자식 물고기 생성
//        FishChild fishChild = new FishChild();
//        fishChild.setLeavingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//
//        fishChild.printSea();

        //핵심 타입
        //묵시적 형 변환
        //1.타입 선언: 부모, 인스턴스화: 부모
        //2.타입선언: 부모, 인스턴스화: 자식
        //3.타입선언:자식, 인스턴스화:자식
        //4.타입선언:자식, 인스턴스화:부모 => 묵시적 변환 X
        Fish fish1 = new Fish(); //1
        fish1.eat("새우");

        Fish fish2 = new FishChild();//2_오버라이드
        fish2.eat("새우");

        Fish fish3 = new FishChild();//3
        fish3.eat("새우");

        //FishChile fish4 = new Fish() //4. error
    }
}
