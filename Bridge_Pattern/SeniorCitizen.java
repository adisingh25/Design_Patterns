package Bridge_Pattern;

public class SeniorCitizen extends Customer{

    SeniorCitizen(String name, int age) {
        super(name, age);
    }

    public void details() {
        System.out.println("---------------Senior Citizen---------------");
        super.details();
        System.out.println("-----------------------------------------------");
    }
}
