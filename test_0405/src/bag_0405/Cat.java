package bag_0405;

public class Cat extends Animal{
    public String gender = "公猫";

    public String getGender() {
        return gender;
    }

    public void eat(String food) {
        System.out.println("Cat 正在吃" + food);
    }
}
