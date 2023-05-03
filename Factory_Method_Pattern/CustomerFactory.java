package Factory_Method_Pattern;

public class CustomerFactory {
    public Customer getCutomer(String input) {
        if(input.equals("kids")) {
            return new Kids();
        }
        else if (input.equals("teens")) {
            return new Teenagers();
        }
        else if(input.equals("senior")) {
            return new Senior();
        }
        else {
            return null;
        }
    }
}
