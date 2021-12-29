public class SubscriberFactory {
    public enum SubscriberType{
        child, teenager, adult;
    }
    public static Subscriber createSubscriber(SubscriberType subscriberType) throws IllegalAccessException {
        switch(subscriberType){
            case child: return new Children();
            case teenager: return new Teens();
            case adult: return new Adults();
        }
        throw new IllegalAccessException("The subscriber" + subscriberType + "is not recognized");
    }
}
