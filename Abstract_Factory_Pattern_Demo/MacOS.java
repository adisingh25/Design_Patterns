package Abstract_Factory_Pattern_Demo;

public class MacOS extends Factory{
    @Override
    Button createButton() {
        System.out.println("Creating a Button for Mac OS.");
        return new MacButton();
    }

    @Override
    Textbox createTextbox() {
        System.out.println("Creating a Text Box for Mac OS.");
        return new MacTextbox();
    }
}
