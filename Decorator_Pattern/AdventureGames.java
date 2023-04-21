package Decorator_Pattern;

public class AdventureGames extends Decorator{

    int stockCount;

    AdventureGames(getCurrentStock o) {
        super(o);
        this.stockCount = 5;
    }


    public int getStocknumber() {
        System.out.println("Sending you count for the Adventure Games (Outdoor Games) ");

        return stockCount + super.getStocknumber();
    }
}
