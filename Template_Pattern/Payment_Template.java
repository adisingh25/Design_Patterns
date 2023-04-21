package Template_Pattern;

abstract class Payment_Template {
    abstract void selectItem();
    abstract void doPayment();
    abstract void doDelivery();

    public void order() {
        System.out.println("................Ordering................");
        selectItem();
        doPayment();
        doDelivery();
    }
}
