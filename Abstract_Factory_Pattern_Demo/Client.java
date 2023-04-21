package Abstract_Factory_Pattern_Demo;

import static Abstract_Factory_Pattern_Demo.Factory_Creator.factoryCreator;

public class Client {
    public static void main(String []args) {

        Factory f1 = factoryCreator("windows");
        Button b1 = f1.createButton();
        b1.press();
        Textbox t1 = f1.createTextbox();
        t1.show();


        Factory f2 = factoryCreator("macos");
        Button b2 = f2.createButton();
        b2.press();
        Textbox t2 = f2.createTextbox();
        t2.show();

    }
}
