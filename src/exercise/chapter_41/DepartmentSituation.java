package exercise.chapter_41;

//결제상황
public class DepartmentSituation {
    public static void main(String[] args) throws InterruptedException {
        //전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setAllSales(1_000_000);

        String hello = "Hello";
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        String hello3 = new String("Hello");

        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");

        Customer customer3 = new VIPCustomer("광해군");

        Customer customer4 = new VIPCustomer("아이유");
        Customer customer5 = new VIPCustomer("김혜수");
        Customer customer6 = new GoldCustomer("정우성");
        Customer customer7 = new GoldCustomer("손흥민");


        //손님 줄>배열
        //array 촉화
        Customer[] customerQueue = {
                new GoldCustomer("정우영")
        };

        //단골손님
        Customer customer = new VIPCustomer("아이유");


        //시나리오
        for(Customer customerEach: customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은: %d\n", cash);
            staff.Income(cash);
        }
        staff.todaySales();

        while(true){
            Thread.sleep(100);
        }

//        //1.'손님'은 '점원'에게 '가격'으로 결제 요청을 한다.
//        customer.askPayment(11111);
//        //2.'점원'은 '손님'정보에 기반하여 물품 계산을 한다.
//        staff.helpPayment("나영희", 30000);
//        //3.'점원'은 '자신의매상'에 결제 금액을 추가한다.
//        staff.Income(30000);
//        //4.기다리는 '손님'이 남아있다면 다시 (1)을 수행한다
//        //5.'점원'은 오늘 최종 매상을 출력한다.
//        staff.todaySales();
    }
}
