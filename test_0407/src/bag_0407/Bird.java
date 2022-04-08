package bag_0407;

//实现多个接口，接口之间用‘,’连接
public class Bird extends Animal implements IRunning,IFlying{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "一跳一跳的跑");
    }
    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }
}
