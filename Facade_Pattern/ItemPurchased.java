package Facade_Pattern;

import java.util.*;

public class ItemPurchased {
    HashMap<String,Integer> Items;
    int itemTypes;

    ItemPurchased() {
        Items = new HashMap<String,Integer>();
    }

    int getItemTypes() {
        return this.itemTypes;
    }

    void getItemsPurchased() {

        System.out.println("------Items Purchased-----");
        System.out.println(List.of(Items));
    }

    void storePurchaseDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many item types have you bought?");
        itemTypes = sc.nextInt();

        for(int i=0; i<itemTypes; i++) {
            System.out.println("Enter the name of item:"+(i+1));
            String name = sc.next();
            System.out.println("item"+(i+1)+" How many did you buy?");
            Integer qty = sc.nextInt();
            Items.put(name, qty);
        }
    }

}
