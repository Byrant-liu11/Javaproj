package task;

public class Task3 {
    public String str;
    public static void main(String[] args) {
        Task3 t1 = new Task3();
        t1.str = "hello world";
        String t2 = t1.str.replace("world","liu");
        System.out.println(t2);
    }
}
