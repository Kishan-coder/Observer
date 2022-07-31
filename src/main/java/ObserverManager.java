import java.util.ArrayList;
import java.util.List;

public abstract class ObserverManager {
    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void deRegisterObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyChange();
}
