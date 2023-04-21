package Bridge_Pattern;

public class Discount_Type1 implements Discount_Strategy{
    private double billAmount;
    private double discountRate=0.25;
    @Override
    public void billAmount(double amount) {
        System.out.println("Your Discount Rate is : " + discountRate);
        System.out.println("Your Bill Amount (before discount) is : " + amount);
        billAmount = amount - amount * discountRate;
        System.out.println("Your final bill to pay after discount : " + billAmount);
    }
}
