package Template_Pattern;

public class Online extends Payment_Template{
    double totalAmount;
    double shippingCharge;
    double deliveryCharge;

    @Override
    void selectItem() {
        System.out.println("Item 1 : 400.50");
        System.out.println("Item 2 : 500.50");
        System.out.println("Item 3 : 600.50");
        System.out.println("Item 4 : 700.50");
        System.out.println("Item 5 : 800.50");

        totalAmount = 400.50 + 500.50 + 600.50 + 700.50 + 800.50;

    }

    @Override
    void doPayment() {
        System.out.println("----------You can pay your bill amount through Networking----------");
        System.out.println("Total Amount to be paid : " + totalAmount);
    }

    @Override
    void doDelivery() {
        deliveryCharge = 20;
        shippingCharge = 10;

        System.out.println("Thank You! for shopping with us........!!");
        System.out.println("Bill Amount : " + totalAmount);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Shipping Charge : " + shippingCharge);
        System.out.println("Amount to be paid : " + (totalAmount + deliveryCharge + shippingCharge));
        System.out.println(".........................................");
    }
}
