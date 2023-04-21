package Bridge_Pattern;

public class Client {
    public static void main(String []args) {

        Customer c1 = new RegularCustomer("Aman Gupta", 35);
        c1.setDiscountType(new Discount_Type2());
        c1.details();
        c1.calculateDiscount(8750.50);

        Customer c2 = new RegularCustomer("Parth Gupta", 65);
        c2.setDiscountType(new Discount_Type1());
        c2.details();
        c2.calculateDiscount(6750.50);
    }
}
