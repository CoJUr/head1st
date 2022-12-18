package SimUDuck;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); //initially set so model ducks can't fly
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }


}
