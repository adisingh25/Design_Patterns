package Decorator_Pattern;

public class Client {
    public static void main(String []args) {

        IndoorSports I1 = new IndoorSports();
        OutdoorSports O1 = new OutdoorSports();

        CourtGames g1 = new CourtGames(I1);
        GamesOnTable g2 = new GamesOnTable(I1);

        AdventureGames g3 = new AdventureGames(O1);
        StadiumGames g4 = new StadiumGames(O1);

        System.out.println(g1.getStocknumber());
        System.out.println(g2.getStocknumber());
        System.out.println(g3.getStocknumber());
        System.out.println(g4.getStocknumber());

    }
}
