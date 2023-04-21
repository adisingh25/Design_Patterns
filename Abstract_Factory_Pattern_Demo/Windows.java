package Abstract_Factory_Pattern_Demo;

public class Windows extends Factory{
    @Override
    Button createButton() {
        System.out.println("Creating a Button for Windows OS.");
        return new WindowsButton();
    }

    @Override
    Textbox createTextbox() {
        System.out.println("Creating a Text Box for Windows OS.");
        return new WindowsTextbox();
    }
}
