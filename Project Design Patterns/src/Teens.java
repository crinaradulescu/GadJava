public class Teens extends Subscriber{
    public int getAge(){
        return 16;
    }

    public void subscribe(Youtuber youtuber){
        this.youtuber = youtuber;
        this.youtuber.attach(this);
    }

    @Override
    public void update() {
        System.out.println("This teen subscriber liked your " + youtuber.getContent());
    }
}
