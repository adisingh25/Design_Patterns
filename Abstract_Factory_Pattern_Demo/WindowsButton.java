package Abstract_Factory_Pattern_Demo;

public class WindowsButton extends Button{
    @Override
    void press() {
        System.out.println("Pressing a button on Windows System.");
    }
}
