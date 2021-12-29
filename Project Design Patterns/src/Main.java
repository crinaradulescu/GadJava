public class Main {
    public static void main(String args[]) throws IllegalAccessException {
        SubscriberFactory s_Factory = new SubscriberFactory();
        Subscriber s1 = s_Factory.createSubscriber(SubscriberFactory.SubscriberType.valueOf("child"));
        Subscriber s2 = s_Factory.createSubscriber(SubscriberFactory.SubscriberType.valueOf("teenager"));
        Subscriber s3 = s_Factory.createSubscriber(SubscriberFactory.SubscriberType.valueOf("adult"));
        Youtuber y1 = new Youtuber();
        s1.subscribe(y1);
        s2.subscribe(y1);
        s3.subscribe(y1);
        for(SubscriberFactory.SubscriberType subscriberType : SubscriberFactory.SubscriberType.values()){
           System.out.println("Age of this " + subscriberType + " subscriber is " + SubscriberFactory.createSubscriber(subscriberType).getAge());
        }
        y1.setContent("video");
        y1.setContent("vlog");
    }
}
