import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        inputPassWord();
    }

    public static void inputPassWord() {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (;i < 3;i++) {
            System.out.println("请输入密码：");
            String input = scanner.next();
            //采用equals方法完成字符串比较
            if (input.equals(password)) {
                System.out.println("密码正确，登陆成功");
                break;
            } else {
                System.out.println("密码错误，请重新输入：");
            }
        }
        if (i == 3) {
            System.out.println("您已经连续失败3次，系统强制退出！");
        }
    }
}
