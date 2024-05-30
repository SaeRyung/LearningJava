package exercise.chapter_34;

public class Customer {
    //속성
    private int customerID = 1; //고객ID
    private String customerName; //고객이름
    private String customerGrade; //고객등급
    private double bonusPoint; //보너스포인트
    private double saveRatio; //적립비율


    private int money;

    //행위
    //1. 돈을 지불한다
    public void Payment(int money){
        this.money = money;
        System.out.println("돈을 지불하다.");
    }

    //참고
    //생성 시 'SILVER' 등급으로 시작한다
    //생성 시 포인트 비율은 '0.01' 포인트
    //고객 ID는 "Customer{숫자}로 순차생성
    public void startGrade(){
        this.customerGrade = "SILVER";
        this.bonusPoint = 0.01;
        this.customerID = Integer.parseInt("Customer " + customerID++);
    }
}
