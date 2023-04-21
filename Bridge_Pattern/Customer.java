package Bridge_Pattern;

abstract class Customer {
    private String name;
    private int age;
    Discount_Strategy ds;

    Customer(String name , int age) {
        this.name = name;
        this.age = age;
    }

    void setDiscountType(Discount_Strategy type) {
        this.ds = type;
    }


    void calculateDiscount(double amount) {
        ds.billAmount(amount);
    }

    public void details() {
        System.out.println("Name : " + this.name + " Age : " + this.age);
    }


}
