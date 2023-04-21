package Observer_Pattern;


public interface Subject {
    public void attach(Customer c);
    public void notifyCustomer();
}
