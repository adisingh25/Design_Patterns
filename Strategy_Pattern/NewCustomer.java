package Strategy_Pattern;

public class NewCustomer extends Customer{

    NewCustomer(String name, int age) {
        super(name, age);
        ds= new Type1();
    }

    @Override
    void display() {
        System.out.println("\n_____A New Customer_____\n");
        super.display();
    }
}
