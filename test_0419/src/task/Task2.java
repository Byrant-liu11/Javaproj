package task;

import java.util.Scanner;

public class Task2 {
    public static int digitSum (int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int ret = digitSum(scanner.nextInt());
        System.out.println(ret);
    }
}
