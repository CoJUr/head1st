package Observer;

import java.util.Observer;

public interface Subj {
    //each subject has many observers
    public void registerObserver();
    public void removeObserver();
    public void notifyObservers();
}



