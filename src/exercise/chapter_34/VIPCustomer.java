package exercise.chapter_34;

public class VIPCustomer extends Customer {

//    //default 접근제어자 static
    //static은 설계도(=클래스)에 속한것, 클래스변수. 이어받지 않음!!!!!!
    static int numberID = 1;
//
//    //속성
//부모클래스 이어받음
    //고객ID
    //고객이름
    //고객등급
    //보너스 포인트
    //적립비율

    private String chargeVIP; //VIP 담당 직원 ID
    private double discountRate; //구매 할인율

    //행위
    //1. 돈을지불한다
    //오버라이드 추가
    @Override
    public int payment(int price){
        this.bonusPoint += price * saveRatio;
        price -= price * discountRate;
        return price;
    }

    //2. vip 담당 직원을 부른다.
    public void callChargeVIP(){
        System.out.println("담당직원 " + this.chargeVIP + "님 문의드릴게 있습니다." );

    }
    //참고

    public VIPCustomer(String customerName){
        super();
        this.customerID = "VIP" + numberID++;
        this.customerName = customerName;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.saveRatio = 0.05;
        this.discountRate = 0.1;

    }

    public void setChargeID(String chargeVIP){
        this.chargeVIP = chargeVIP;
    }

    //출력 위한 메소드
    @Override
    void printMyInfo(){
        //VIP만 붙고 결과 출력
        System.out.print("VIP");
        super.printMyInfo();
    }


}
