package Factory_Method_Pattern;

public class Senior implements Customer{
    @Override
    public void getDetails() {
        System.out.println("Hello Sir/Mam! Nice to meet you again!!");
    }

    @Override
    public void getGifts() {
        System.out.println("Today we have a sale on electronic gadgets!!! Kindly have a look of that!");
    }
}
