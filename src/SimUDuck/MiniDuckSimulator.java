package SimUDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        System.out.println("Model ducks methods:");
        model.performFly();
        //flyBehavior calls initialized FlyNoWay instance (constructor)
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // dynamically changed behavior at runtime to flyRocketPowered
    }
}
