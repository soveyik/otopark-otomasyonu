
public interface SubjectInterface {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String message);
    void sistemKesintisi();
}