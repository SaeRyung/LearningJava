package exercise.chapter_29;

public class CoffeeShopSituation {
    //손님: 현금 5만원
    //매장: 100만원

    public static void main(String[] args) {
        //미리 초기화
        Customer customer = new Customer();
        customer.setCashAmount(50_000); //초기값 5만원 설정


        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();


        //로직시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;


        //Customer-1
        customer.askCoffee(cashier, coffeeName);

        //Cashier-1
       long price =  cashier.checkCoffeePrice(coffeeName);
       //Cashier-2
       cashier.replyCoffeePrice(coffeeName, (int) price);
       //Customer-2 , 3
        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        //Cashier-3,4
        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        //Barista-1~3
        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        barista.sayCoffeeReady(coffee);

        //Cashier-6
        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        //customer-4,5
        customer.drinkCoffee(coffeeCompleted);
        //본인 주문 맞는지 확인 로직 추가
        if(coffeeCompleted.getCoffeeName() == coffeeName && coffeeCompleted.isWrappedUp() == isTakeOut){
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();
        



    }
}
