package Factory_Method_Pattern;

public class Client {
    public static void main(String []args) {

        CustomerFactory cf1 = new CustomerFactory();
        Customer c1 = cf1.getCutomer("kids");
        c1.getDetails();
        c1.getGifts();

        Customer c2 = cf1.getCutomer("teens");
        c2.getDetails();
        c2.getGifts();

        Customer c3 = cf1.getCutomer("senior");
        c3.getDetails();
        c3.getGifts();
    }
}
