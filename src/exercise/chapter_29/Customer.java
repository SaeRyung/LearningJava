package exercise.chapter_29;

public class Customer {
    //시나리오
    //1. '손님'은 '캐셔'에게 '아메리카노'가격 물어본다.
    //2. '손님'은 '자신의 현금'에서 돈을 뺀다
    //3. '손님'은 '아메리카노'를 '테이크아웃'으로 주문한다.
    //4. '손님'은 '아메리카노 커피'를 마신다
    //5. '손님'은 자신의 기분이 좋아진다.
    private long cashAmount; //현금
    private String myFeeling; //현재 기분

    //행위
    //1. 캐셔에게 가격 물어본다.
    public void askCoffee(Cashier cashier, String coffeeName){
        System.out.println("손님: 커피 " + coffeeName + " 얼마인가요?");
    }

    //2. 손님은 자신의 현금에서 돈 뺀다.
    public long withDrawCash(long amount){
        this.cashAmount -= amount;
        return amount;
    }

    //3. 테이크아웃 주문
    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.println("손님: 커피 " + coffeeName + " 을 주문할게요."
        + " 단, 포장 여부는 " + isWrappedUp + " 으로 부탁드려요.");
    }
    //4. 마시는 행위
    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피 " + coffeeName + "을 마신다.");
    }
    //5.기분 좋아진다.
    public void upgradeMyFeeling(){
        this.myFeeling = "기분이 좋아졌다.";
    }

    //CoffeeShopSituation,,,,generage > setter 클릭 / setter추가
    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
