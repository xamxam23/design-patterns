package structural.decorator;

public abstract class Decorator implements ComponentBase{

    protected ComponentBase componentBase;

    public Decorator(ComponentBase componentBase){
        this.componentBase = componentBase;
    }
}
