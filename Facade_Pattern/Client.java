package Facade_Pattern;

import java.util.Scanner;

public class Client {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bill amount : ");
        double billAmount = sc.nextDouble();
        System.out.print("\nDo you have a giftCard (true/false) : " );
        boolean value = sc.nextBoolean();
        Facade fc = new Facade(value, billAmount);

        fc.calculateAmountToPay();
        fc.displayItemsPurchased();
    }
}
