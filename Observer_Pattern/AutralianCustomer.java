package Observer_Pattern;

public class AutralianCustomer implements Customer{

    String name;
    Subject country;
    double myDiscount;

    AutralianCustomer(String name, Subject country) {
        this.name = name;
        this.country = country;
        this.country.attach(this);
    }

    @Override
    public void getUpdate(double amount) {
        System.out.println("Hey, " + this.name + " you are getting a flat " + amount + " discount this month.");
        myDiscount = amount;
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Discount : " + this.myDiscount);
    }
}
