package Facade_Pattern;

import java.util.Scanner;

public class ProcessSales {
    boolean giftCard;
    int numItems;
    double billAmount;

    ProcessSales(boolean gc, int itemCount, double amount) {
        this.giftCard = gc;
        this.numItems = itemCount;
        this.billAmount = amount;
    }

    void processSale() {
        double giftCardValue, cashToPay;
        Scanner sc = new Scanner(System.in);
        if(!giftCard) {
            System.out.println("You dont have a Gift Certificate");
            System.out.println("Therefore pay Rs." + billAmount);
        }

        else {
            System.out.println("Gift Certificate Value? ");
            giftCardValue = sc.nextDouble();

            if(numItems > 1) {
                System.out.println("You can purchase only ONE item with the Gift Certificate worth Rs." + giftCardValue );
                System.out.println("You have bought " + numItems + ".Gift Voucher NOT Applicable!");
                System.out.println("Currently pay full Bill Amount Rs." + billAmount);
            }
            else if(numItems <=0)
                System.out.println("You have not bought any Items!");

            else if(giftCardValue < billAmount) {
                cashToPay =  billAmount - giftCardValue;
                System.out.println("Your Bill Amount is Rs." + billAmount+" Gift Certificate is worth Rs." + giftCardValue);
                System.out.println("You need to pay Rs."+cashToPay);
            }
            else if(giftCardValue > billAmount){
                System.out.println("You need not pay anything for your Bill Amount of Rs."+billAmount);
                cashToPay =  giftCardValue - billAmount;
                System.out.println("Gift certificate value Rs."+giftCardValue+" you are non returnable balance"+cashToPay);
            }


        }
    }
}
