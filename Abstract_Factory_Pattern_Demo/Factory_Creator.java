package Abstract_Factory_Pattern_Demo;

public class Factory_Creator {

    public static Factory factoryCreator(String type) {
        if(type.equals("windows")) return new Windows();
        else return new MacOS();
    }

}
