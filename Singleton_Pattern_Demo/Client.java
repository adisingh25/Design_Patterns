package Singleton_Pattern_Demo;

public class Client {
    public static void main(String[] args) {

        DatabaseConnection db1;
        db1 = DatabaseConnection.getInstance();
        System.out.println("----------Creating a new DB instance-------------");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
    }

}
