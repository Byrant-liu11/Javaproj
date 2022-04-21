package task;

import java.util.Scanner;

public class Task3 {
    public static int recursiveSum (int n) {
        if (n == 1) {
            return 1;
        }
        return recursiveSum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个要求和的数：");
        int ret = recursiveSum(scanner.nextInt());
        System.out.println(ret);
    }
}
