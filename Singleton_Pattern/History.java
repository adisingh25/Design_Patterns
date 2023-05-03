package Singleton_Pattern;

import Singleton_Pattern_Demo.DatabaseConnection;

import java.util.ArrayList;

public class History {
    private static History myHistory;
    private ArrayList<String> list = new ArrayList<String>();

    public static History getInstance() {
        if(myHistory == null) {
            myHistory = new History();
        }
        System.out.println("_________Fetching your History___________");
        return myHistory;
    }

    void addtoHistory(String s) {
        list.add(s);
    }

    void getHistory() {
        for(String x : list) {
            System.out.println(x);
        }
    }


}
