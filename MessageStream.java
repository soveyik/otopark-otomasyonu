import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{
    private Deque<String> messageHistory = new ArrayDeque<>();
    private Subject subject = new Subject();

    public void setState(String message){
        messageHistory.add(message);
        subject.notifyObservers(message);
    }

    public String getState(){
        return messageHistory.getLast();
    }
    
}