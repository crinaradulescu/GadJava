public class Children extends Subscriber {
    public int getAge() {
        return 8;
    }

    public void subscribe(Youtuber youtuber){
        this.youtuber = youtuber;
        this.youtuber.attach(this);
    }

    @Override
    public void update() {
        System.out.println("This child subscriber liked your " + youtuber.getContent());
    }
}
