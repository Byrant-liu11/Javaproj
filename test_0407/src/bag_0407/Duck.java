package bag_0407;

public class Duck extends Animal implements IRunning,IFlying,ISwimming{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }

    @Override
    public void run() {
        System.out.println(name + "一摆一摆的跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "两条腿在跑");
    }
}
