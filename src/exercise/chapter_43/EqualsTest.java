package exercise.chapter_43;

public class EqualsTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1", "민철");

        Customer customer4 = new Customer("ID2", "철민");


        System.out.println(customer1);
        System.out.println(customer3);

        System.out.println(customer1.equals(customer2));


        System.out.println(customer1.equals(customer3));
        System.out.println(customer1==customer3); //==는 원형메모리값 비교하므로 false

        System.out.println(customer1.equals(customer4));

    }
}
