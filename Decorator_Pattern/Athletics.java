package Decorator_Pattern;

public class Athletics extends Decorator{

    int stockCount;

    Athletics(getCurrentStock o) {
        super(o);
        this.stockCount = 10;
    }


    public int getStocknumber() {
        System.out.println("Sending you count for the Athletics (Outdoor Games) ");
        return stockCount + super.getStocknumber();
    }
}
