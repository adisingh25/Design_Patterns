package Adapter_Pattern;

public class MauritiusTax implements CalcTax {
    MauriTax m1 = new MauriTax();
    double taxAmount=0.0;

    @Override
    public double taxAmount(String item, int quantity, double price) {
        taxAmount = m1.calcTax(quantity, price);
        return taxAmount;
    }
}
