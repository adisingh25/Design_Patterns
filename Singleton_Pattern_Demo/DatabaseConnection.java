package Singleton_Pattern_Demo;

public class DatabaseConnection {

    private static DatabaseConnection dbObject;

    private DatabaseConnection () {
        System.out.println("A new instance of the database has been created!!");
    }


    public static DatabaseConnection getInstance() {
        if(dbObject == null) {
            dbObject = new DatabaseConnection();
        }
        System.out.println("_________Connecting to Database___________");
        return dbObject;
    }

}
