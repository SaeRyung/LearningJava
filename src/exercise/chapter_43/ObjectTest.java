package exercise.chapter_43;

import exercise.chapter_43.Customer;

public class ObjectTest {
    public static void main(String[] args) {
        //object로 업캐스팅
        Customer customer = new Customer("민철");
        System.out.println(customer);


        GoldCustomer customer2 = new GoldCustomer("철민");
        System.out.println(customer2);

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("아이유");

        System.out.println(staff);
        System.out.println(vipCustomer);
    }


}
