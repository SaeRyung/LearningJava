package exercise.chapter_41;

public class  Customer {
    //속성
    static int numberID = 1; //고객ID 숫자 순차생성>static



    protected String customerID; //고객ID
    protected String customerName; //고객이름
    protected String customerGrade; //고객등급

    protected int bonusPoint; //보너스포인트
    protected double saveRatio; //적립비율



    //행위
    //1. 돈을 지불한다
    public int payment(int price){

        this.bonusPoint += price * saveRatio;
        return price;
    }

    //참고
    //생성 시 'SILVER' 등급으로 시작한다
    //생성 시 포인트 비율은 '0.01' 포인트
    //고객 ID는 "Customer{숫자}로 순차생성
    
    //default생성자 먼저 생성 > 자식클래스 실행 위해
    Customer(){}

    public Customer(String customerName){
        this.customerID = "Customer" + numberID++;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.saveRatio = 0.01; //포인트 비율
        this.bonusPoint = 0; //처음 포인트는 0
    }

    //출력 위한 메소드
    public void printMyInfo(){
        System.out.printf("Customer(customerID = %s, name = %s, customerGrade = %s, bonusPoint =%s )\n"
        , this.customerID, this.customerName, this.customerGrade, this.bonusPoint);
    }



}
