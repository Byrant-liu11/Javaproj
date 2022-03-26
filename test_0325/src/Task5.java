import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //求n的阶乘之和
        System.out.println("请输入要求的阶乘之和数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = sumofFactorials(num);
        System.out.println(num + "的阶乘之和为：" + result);
    }
    public static int sumofFactorials(int n) {
        int result1 = 0;
        for (int i = 1;i <= n;i++) {
            int result2 = 1;
            for (int j = 1;j <= i;j++ ) {
                result2 *= j;
            }
            result1 += result2;
        }
        return result1;
    }
}
