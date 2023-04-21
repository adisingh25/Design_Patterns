package Decorator_Pattern;

public class BoardGames extends Decorator {

    int stockCount;

    BoardGames(getCurrentStock o) {
        super(o);
        this.stockCount = 20;
    }


    public int getStocknumber() {
        System.out.println("Sending you count for the Board Games (Indoor Games) ");
        return stockCount + super.getStocknumber();
    }
}
