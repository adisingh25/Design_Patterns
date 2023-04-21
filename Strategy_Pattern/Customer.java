package Strategy_Pattern;

public class Customer {
    String name;
    int age;
    DiscountStrategy ds;


    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void calculateDiscount(double bill) {
        ds.calculateBillAmount(bill);
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);

    }
}
