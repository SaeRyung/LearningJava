package exercise.chapter_17;

public class StarbuckCoupon {
    public static void main(String[] args) {
        //
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        if (clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4) {
            System.out.println("스타벅스 커피 쿠폰 당첨");
        }
        else{
                System.out.println("아니요, 1번째 내돈내산 커피 먹습니다.");
        }
    }
}
//개선과정 : 리펙토링
