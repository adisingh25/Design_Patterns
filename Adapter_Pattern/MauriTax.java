package Adapter_Pattern;

public class MauriTax {
    double calcTax(int quantity, double price) {
        return quantity*price*(0.25f);
    }
}
