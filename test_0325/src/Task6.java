import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //求n的阶乘之和
        System.out.println("请输入要求的阶乘数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = factorials(num);
        System.out.println(num + "的阶乘为：" + result);
    }
    public static int factorials(int n) {
        int result1 = 1;
        for (int i = 1;i <= n;i++) {
            result1 *= i;
        }
        return result1;
    }
}
