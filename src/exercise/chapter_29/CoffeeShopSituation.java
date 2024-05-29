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



    }
}
