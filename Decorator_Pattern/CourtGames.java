package Decorator_Pattern;

public class CourtGames extends Decorator{

    int stockCount;

    CourtGames(getCurrentStock o) {
        super(o);
        this.stockCount = 30;
    }


    public int getStocknumber() {
        System.out.println("Sending you count for the Court Games (Indoor Games) ");
        return stockCount + super.getStocknumber();
    }
}
