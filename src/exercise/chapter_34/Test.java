package exercise.chapter_34;

public class Test {
    public static void main(String[] args){
        Customer customer1 = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관종");
        Customer customer2 = new Customer("나영희");

        customer1.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();
    }
}
