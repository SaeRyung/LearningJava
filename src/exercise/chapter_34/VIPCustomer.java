package exercise.chapter_34;

public class VIPCustomer {
    static int serialNums;
    //속성
    private String customerID;
    private String name;
    private String customerGrade;

    private int bonusPoint;
    private double bonusPointRatio;


    private String agentID; //vip담당직원
    private double discountRatio;


    //행위
    //1. 돈을 지불한다
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }
    //2. VIP 담당 직원을 부른다
    public void callAgent(){
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요~");
    }


    //참고
    public VIPCustomer(String name){
        this.customerID = "VIP "+ serialNums++;
        this.name = name;
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
