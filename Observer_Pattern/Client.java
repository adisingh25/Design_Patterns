package Observer_Pattern;

public class Client {
    public static void main(String []args) {

        Subject festival = new IndianFestival();
        Customer c1 = new IndianCustomer("Aditya", festival);
        Customer c2 = new AutralianCustomer("Daniel", festival);

        festival.notifyCustomer();

        c1.display();
        c2.display();
    }

}
