public class Observer implements ObserverInterface{
    public void update(String message){
        System.out.println("Sistem durumu " + message);
    }
}