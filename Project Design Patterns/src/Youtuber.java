import java.util.ArrayList;
import java.util.List;

public class Youtuber {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String content;

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
        notifyAllSubscribers();
    }

    public void attach(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void notifyAllSubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }
}
