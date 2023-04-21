package Abstract_Factory_Pattern_Demo;

public class WindowsTextbox extends Textbox{
    @Override
    void show() {
        System.out.println("Showing the content on Windows TexBox");
    }
}
