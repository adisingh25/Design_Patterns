package Template_Pattern;

public class Offline extends Payment_Template{

    double totalAmount;

    @Override
    void selectItem() {
        System.out.println("----Items available----");
        System.out.println("Item 1 : 400.50");
        System.out.println("Item 2 : 500.50");
        System.out.println("Item 3 : 600.50");
        System.out.println("Item 4 : 700.50");
        System.out.println("Item 5 : 800.50");


        System.out.println("---------Items Selected----------");
        System.out.println("Item 1 : 400.50");
        System.out.println("Item 2 : 500.50");
        System.out.println("Item 3 : 600.50");

        totalAmount = 400.50 + 500.50 + 600.50;
    }

    @Override
    void doPayment() {
        System.out.println("----------You can pay your bill amount through---------- \n 1.Cash \n 2.Swipe-Card\n");
        System.out.println("Total Amount to be paid : " + totalAmount);
    }

    @Override
    void doDelivery() {
        System.out.println("Thank You! for shopping with us........!!");
        System.out.println("Bill Amount : " + totalAmount);
        System.out.println("You can now collect your order from counter number 2");
        System.out.println(".........................................");
    }
}
