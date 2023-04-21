package Strategy_Pattern;

public class Type2 implements DiscountStrategy{

    double billAmount;
    double discount;

    Type2() {
        this.discount = 0.12;
    }

    @Override
    public void calculateBillAmount(double amount) {

       if(amount>2000) {
           amount = amount - 100;
       }
        billAmount = amount - amount * discount;

        System.out.println("Your total bill : " +  amount);
        System.out.println("Your bill after the discount : " + billAmount);
    }
}
