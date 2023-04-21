package Strategy_Pattern;

public class Type1 implements DiscountStrategy{

    double billAmount;
    double discount;

    Type1() {
        this.discount = 0.15;
    }

    @Override
    public void calculateBillAmount(double amount) {
        billAmount = amount - amount * discount;
        System.out.println("Your total bill : " +  amount);
        System.out.println("Your bill after the discount : " + billAmount);
    }
}
