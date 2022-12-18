package SimUDuck;

public class FlyNoWay implements FlyBehavior{
//behavior for non flying ducks like decoy and rubber ducks
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
