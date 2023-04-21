package Decorator_Pattern;

public class StadiumGames extends Decorator{

    int stockCount;

    StadiumGames(getCurrentStock o) {
        super(o);
        this.stockCount = 60;
    }


    public int getStocknumber() {
        System.out.println("Sending you count for the Stadium Games (Outdoor Games) ");
        return stockCount + super.getStocknumber();
    }
}
