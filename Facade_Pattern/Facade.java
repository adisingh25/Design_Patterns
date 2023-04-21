package Facade_Pattern;



public class Facade {

    ItemPurchased I1;
    ProcessSales P1;

    Facade(boolean giftCard, double billAmount){
        I1 = new ItemPurchased();
        I1.storePurchaseDetails();
        int numItems = I1.getItemTypes();
        System.out.println("Number of Items Purchased is " + numItems);
        System.out.println("Gift Certificate exists " + giftCard);
        P1 = new ProcessSales(giftCard, numItems, billAmount);
    }
    void displayItemsPurchased() {
        I1.getItemsPurchased();
    }


    void calculateAmountToPay() {
        P1.processSale();
    }
}
