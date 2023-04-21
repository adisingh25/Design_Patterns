package Strategy_Pattern;

public class Client {

    public static void main(String[] args) {

        double myAmount = 8000.65;
        RegularCustomer r1 = new RegularCustomer("Mehul Gupta", 21);
        r1.display();
        r1.calculateDiscount(myAmount);


        NewCustomer n1 = new NewCustomer("Vansh Mathur", 20);
        n1.display();
        n1.calculateDiscount(myAmount);



        SeniorCitizens s1 = new SeniorCitizens("Pawan Kumar", 65);
        s1.display();
        s1.calculateDiscount(myAmount);
    }
}
