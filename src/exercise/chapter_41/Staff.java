package exercise.chapter_41;

public class Staff {
    //속성
    private int AllSales; //매상

    //행위
    //1. 손님 요청 결제한다.
    public int helpPayment(Customer customer, int price){
        return customer.payment(price);

    }
//    //직원이 결제 도와드리겠습니다.
//    public int helpPayment(VIPCustomer customer, int price){
//        return customer.payment(price);
//    }

    //2. 매상에 돈을 더한다.
    public void Income(int cash){
        AllSales += cash;

    }

    //3. 최종 매상
    public void todaySales(){
        System.out.println("오늘의 최종 매상은 " + this.AllSales + "원 입니다." );
    }

    //DepartmentSituation 사용 위해
    //setter
    public void setAllSales(int allSales) {
        AllSales = allSales;
    }


}
