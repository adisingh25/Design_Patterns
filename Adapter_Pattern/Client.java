package Adapter_Pattern;

public class Client {
    public static void main(String[] args) {
        IndiaTax c1 = new IndiaTax();
        Item i1 = new Item("Cricket Bat", 1875.60, c1);
        i1.setQuantity(10);
        System.out.println("-----Printing Details w.r.t tax in INDIA-----");
        i1.printDetails();
        System.out.println();
        MauritiusTax c2 = new MauritiusTax();
        System.out.println("-----Printing Details w.r.t tax in MAURITIUS-----");
        i1.setTax(c2);
        i1.printDetails();

    }
}
