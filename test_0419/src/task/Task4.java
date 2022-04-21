package task;

import java.util.Scanner;

public class Task4 {
    public static int accumulativeMul(int n) {
        if (n == 1) {
            return 1;
        }
        return accumulativeMul(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要进行累乘的数：");
        int ret = accumulativeMul(scanner.nextInt());
        System.out.println(ret);
    }
}
