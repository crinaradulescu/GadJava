public class Adults extends Subscriber{
    public int getAge() {
        return 34;
    }

    public void subscribe(Youtuber youtuber){
        this.youtuber = youtuber;
        this.youtuber.attach(this);
    }

    @Override
    public void update() {
        System.out.println("This adult subscriber liked your " + youtuber.getContent());
    }
}
