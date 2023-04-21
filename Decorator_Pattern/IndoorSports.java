package Decorator_Pattern;

public class IndoorSports implements getCurrentStock{

    int stockCount;

    IndoorSports() {
        this.stockCount = 10;
    }


    @Override
    public int getStocknumber() {
        System.out.println("------Details of the current stock for Indoor Games-------");
        return stockCount;
    }
}
