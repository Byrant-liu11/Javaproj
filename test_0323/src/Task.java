import sun.font.TrueTypeFont;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //数一下 1到 100 的所有整数中出现多少个数字9
//        int num = 1;
//        int count = 0;
//        while (num <= 100) {
//            if (num % 10 == 9) {
//                count++;
//            }
//            //这里不能用else if，因为求的是1-100有多少个9，99包含两个9
//            //用else if就会少算一个9
//            if (num / 10 == 9) {
//                count++;
//            }
//            num++;
//        }
//        System.out.println(count);
        //输出 1000 - 2000 之间所有的闰年
//        int year = 1000;
//        while (year <= 2000) {
//            if (year % 4 == 0 && year % 100 != 0) {
//                System.out.println("闰年：" + year);
//            }
//            if (year % 400 == 0) {
//                System.out.println("闰年："+ year);
//            }
//            year++;
//        }
        //打印 1 - 100 之间所有的素数
//        for (int i = 2;i <= 100;i++) {
//            for (int j = 2;j <= i;j++) {
//                if (i % j == 0 && i != j) {
//                    break;
//                }
//                if (j == i) {
//                    System.out.println("素数：" + j);
//                }
//            }
//        }
        //给定一个数字，判定一个数字是否是素数
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int num = scanner.nextInt();
//        for (int i = 2;i <= num;i++) {
//            if (num % i == 0 && num != i) {
//                System.out.println(num + "不是素数");
//                break;
//            }
//            if (num == i) {
//                System.out.println(num + "是素数");
//            }
//        }
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的年龄：");
//        int age = scanner.nextInt();
//        if (age >= 56) {
//            System.out.println("老年");
//        } else if (age >= 29 && age <= 55) {
//            System.out.println("中年");
//        } else if (age >= 19 && age <= 28) {
//            System.out.println("青年");
//        } else if (age <= 18) {
//            System.out.println("少年");
//        }
        //打印 X 图形
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要打印x的大小：");
//        while (scanner.hasNextInt()) {
//            int num = scanner.nextInt();
//            for (int i = 0;i < num;i++) {
//                for (int j = 0;j < num;j++) {
//                    if (i == j || j == num - i - 1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.print("\n");
//            }
//        }
        //完成猜数字游戏
        //用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字
        //等于的时候退出程序。
//        System.out.println("猜数字游戏");
//        System.out.println("请输入一个数字：");
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int num = random.nextInt(100);
//        while (true) {
//            int recv = scanner.nextInt();
//            if (recv > num) {
//                System.out.println("大了");
//            } else if (recv < num) {
//                System.out.println("小了");
//            } else {
//                System.out.println("恭喜你，猜对了");
//                break;
//            }
//        }
        //求出0～999之间的所有“水仙花数”并输出。
        //“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
        //如；153＝1＋5＋3?，则153是一个“水仙花数”
//        for (int num = 100;num <= 999;num++) {
//            int a = num % 10;
//            int b = (num / 10) % 10;
//            int c = (num) / 100;
//            if (num == a*a*a + b*b*b +c*c*c) {
//                System.out.println("水仙花数：" + num);
//            }
//        }
    }
}
