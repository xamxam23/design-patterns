package structural.decorator;

public class ConcreteComponent implements ComponentBase {
    @Override
    public void op() {
        System.out.println("ConcreteComponent Operation");
    }
}
