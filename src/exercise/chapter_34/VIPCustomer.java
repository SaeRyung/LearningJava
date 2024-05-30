package exercise.chapter_34;

public class VIPCustomer {

    //default 접근제어자 static
    static int numberID = 1;

    //속성
    private String customerID; //고객 ID
    private String customerName; //고객 이름
    private String customerGrade; //고객 등급


    private int bonusPoint; //보너스 포인트
    private double saveRatio; //포인트 적립 비율


    private String chargeVIP; //VIP 담당 직원 ID
    private double discountRate; //구매 할인율


    //행위
    //1. 돈을지불한다
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
    void printMyInfo(){
        System.out.printf("VIPCustomer(customerID = %s, name = %s, customerGrade = %s, bonusPoint =%s )\n"
                , this.customerID, this.customerName, this.customerGrade, this.bonusPoint);
    }


}
