package Factory_Method_Pattern;

public class Teenagers implements Customer{
    @Override
    public void getDetails() {
        System.out.println("Hey Teen! I hope your school/college life is going good!!");
    }

    @Override
    public void getGifts() {
        System.out.println("Today we have a PS5 as a gift for you!!! Have a great day!!");
    }
}
