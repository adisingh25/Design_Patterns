package Factory_Method_Pattern;

public class Kids implements Customer{

    @Override
    public void getDetails() {
        System.out.println("Hello, kid! I hope you are doing good!!");
    }

    @Override
    public void getGifts() {
        System.out.println("Today we have a bunch of chocolates as a gift for you! Enjoy your day!!");
    }
}
