package Decorator_Pattern;

public class OutdoorSports implements getCurrentStock{

    int stockCount;

    OutdoorSports() {
        this.stockCount = 100;
    }

    @Override
    public int getStocknumber() {
        System.out.println("------Details of the current stock for Outdoor Games-------");
        return stockCount;
    }
}
