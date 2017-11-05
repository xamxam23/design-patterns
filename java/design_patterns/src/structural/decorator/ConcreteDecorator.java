package structural.decorator;

public class ConcreteDecorator extends  Decorator{

    public ConcreteDecorator(ComponentBase componentBase) {
        super(componentBase);
    }

    @Override
    public void op() {
        componentBase.op();
        // additional operation
    }
}
