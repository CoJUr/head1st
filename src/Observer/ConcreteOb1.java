package Observer;

public class ConcreteOb1 implements Obs {

    @Override
    public void update() {
        System.out.println("ConcreteOb1: update() called");
    }
}
