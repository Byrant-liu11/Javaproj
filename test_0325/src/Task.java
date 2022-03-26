import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //方法调用
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
//        double result = seriesSum(100);
//        System.out.println(result);
        //求两个正整数的最大公约数
//        int result = calcGreatestCommonDivisor(100,120);
//        System.out.println(result);
        //求一个整数，在内存当中存储时，二进制1的个数。
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = oneNum(num);
//        System.out.println(count);
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        oddNum(num);
//        evenNum(num);
        //输出乘法口诀
//        System.out.println("乘法口诀表：");
//        for (int row = 1;row <= 9;row++) {
//            print(row);
//        }
        //输出一个整数的每一位
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        print1(num);
        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
//        System.out.println("请输入密码：");
//        int key = 938;
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        for (int i = 1;i < 3;i++){
//            if (input != key) {
//                System.out.println("输入错误，请重新输入：");
//                input = scanner.nextInt();
//            }
//            if (i == 2) {
//                System.out.println("输入错误，已退出！");
//                break;
//            }
//        }
    }
    //方法体
    public static void print1(int num) {
        if (num > 9) {
            print1(num / 10);
        }
        System.out.printf("%d ",num % 10);
    }
    public static void print(int row) {
        for (int col = 1;col <=row;col++) {
            System.out.printf("%d x %d = %d ",col,row,col*row);
        }
        System.out.println();
    }
    public static void oddNum(int num) {
        System.out.println("奇数位");
        for (int i = 31;i >= 1;i -= 2) {
            System.out.printf("%d ",(num>>i) & 1);
        }
        System.out.println();
    }
    public static void evenNum(int num) {
        System.out.println("偶数位");
        for (int i = 30;i >=0;i -= 2) {
            System.out.printf("%d ",(num>>i) & 1);
        }
        System.out.println();
    }
    public static int oneNum(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static int calcGreatestCommonDivisor(int a , int b) {
        for (int min = min(a , b);min >= 1;min--) {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
        }
        return 1;
    }
    public static int min (int a,int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public static Double seriesSum(int n) {
        double sum = 0.0;
        for (int i = 1;i <= n;i += 2) {
            sum += calc(i);
        }
        return sum;
    }
    public static Double calc(double i) {
        return 1/i - 1/(i + 1);
    }
}
