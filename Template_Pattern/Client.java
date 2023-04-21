package Template_Pattern;

public class Client {
    public static void main(String []args) {
        Payment_Template o;
        System.out.println("-----------------Online Order----------------------");
        o = new Online();
        o.order();
        System.out.println("-----------------Offline Order---------------------");
        o = new Offline();
        o.order();

    }
}
