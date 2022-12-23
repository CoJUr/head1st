package Observer;

public class ConcreteSub implements Subj{

    @Override
    public void registerObserver() {
        System.out.println("ConcreteSub: registerObserver() called");
    }

    @Override
    public void removeObserver() {
        System.out.println("ConcreteSub: removeObserver() called");
    }

    @Override
    public void notifyObservers() {
        System.out.println("ConcreteSub: notifyObservers() called");
    }
}
