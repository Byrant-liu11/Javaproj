package bag_0407;

public class Cat extends Animal implements IRunning{
    public Cat (String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("四条腿跑");
    }
}
