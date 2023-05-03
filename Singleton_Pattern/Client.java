package Singleton_Pattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        History chrome = History.getInstance();
        System.out.println("Opening new websites in Chrome");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the website : ");
        String url = scan.nextLine();
        chrome.addtoHistory(url);
        System.out.println("Printing my History");
        chrome.getHistory();
    }
}
