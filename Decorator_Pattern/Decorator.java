package Decorator_Pattern;

abstract class Decorator implements getCurrentStock{

    getCurrentStock obj;

    Decorator(getCurrentStock o) {
        this.obj = o;
    }

    @Override
    public int getStocknumber() {
        return obj.getStocknumber();
    }
}
