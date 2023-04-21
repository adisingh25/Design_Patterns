package Bridge_Pattern;

public class RegularCustomer extends Customer{

    RegularCustomer(String name, int age) {
        super(name, age);
    }

    public void details() {
        System.out.println("---------------Regular Customer---------------");
        super.details();
        System.out.println("-----------------------------------------------");
    }
}
