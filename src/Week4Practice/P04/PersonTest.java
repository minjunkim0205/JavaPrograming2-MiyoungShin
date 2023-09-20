package Week4Practice.P04;

public class PersonTest {
    public static void main(String[] args) {
        //이름, 주소, 고객번호, 마일리지
        Customer customer1 = new Customer("hallym", "춘천시", "cn120", 1000);
        //이름, 주소, 전화번호, 고객번호, 마일리지
        Customer customer2 = new Customer("software", "화천군", "248-2328", "cn845", 3000);
        //이름, 주소, 전화번호
        Person person = new Person("computer", "횡성군", "240-5000");

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(person);
    }
}
