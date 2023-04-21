package Strategy_Pattern;

public class Type3 implements DiscountStrategy{
    double billAmount;
    double discount;

    Type3() {
        this.discount = 0.1;
    }

    @Override
    public void calculateBillAmount(double amount) {
        billAmount = amount - amount * discount;
        System.out.println("Your total bill : " +  amount);
        System.out.println("Your bill after the discount : " + billAmount);
    }
}
