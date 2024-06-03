package exercise.chapter_40;

public class GoldCustomer extends Customer {
    private double discountRatio;

    static {
        System.out.println("Gold 클래스가 로딩 됩니다.");
    }
//
    @Override
    public int payment(int price) {
        this.bonusPoint += price * saveRatio;
        price -= price * discountRatio;
        return price;
    }

    //생성자
    public GoldCustomer(String customerName){
        super();
        this.customerID = "Customer" + Customer.numberID++; //customer과 순차를 공유하므로  Customer.numberID로 구현
        this.customerName = customerName;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.saveRatio = 0.03;
    }
}
