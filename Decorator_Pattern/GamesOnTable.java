package Decorator_Pattern;

public class GamesOnTable extends Decorator{

    int stockCount;

    GamesOnTable(getCurrentStock o) {
        super(o);
        this.stockCount = 40;
    }

    public int getStocknumber() {
        System.out.println("Sending you count for the Games on Table (Indoor Games) ");
        return stockCount + super.getStocknumber();
    }


}
