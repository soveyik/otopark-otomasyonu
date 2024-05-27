
import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
    public void sistemKesintisi(){
        notifyObservers("Sistem kesintisi yaşandı lütfen kontrol edin...");
    }
}