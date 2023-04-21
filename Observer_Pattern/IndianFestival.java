package Observer_Pattern;

import java.util.ArrayList;

public class IndianFestival implements Subject{

    double discountAmount = 3000;

    ArrayList<Customer> customersList = new ArrayList<Customer>();


    @Override
    public void attach(Customer c) {
        customersList.add(c);
    }

    @Override
    public void notifyCustomer() {
        for(Customer c : customersList) {
            c.getUpdate(discountAmount);
        }
    }
}
