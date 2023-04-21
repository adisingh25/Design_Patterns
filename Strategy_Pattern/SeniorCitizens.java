package Strategy_Pattern;

public class SeniorCitizens extends  Customer{


    SeniorCitizens(String name, int age) {
        super(name, age);
        ds = new Type3();
    }

    @Override
    void display() {
        System.out.println("\n_____A Senior Citizen_____\n");
        super.display();
    }
}
