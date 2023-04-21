package Strategy_Pattern;

public class RegularCustomer extends Customer{


    RegularCustomer(String name, int age) {
        super(name, age);
        ds = new Type2();
    }

    @Override
    void display() {
        System.out.println("\n_____A Regular Customer_____\n");
        super.display();
    }
}
