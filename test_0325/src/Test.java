import org.w3c.dom.ls.LSInput;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //阶乘求和
//        int result = 0;
//        //外层循环控制求和
//        for (int num = 1;num <= 5;num++) {
//            //里层循环控制阶乘
//            int factorResult = 1;
//            for (int i = 1;i <= num;i++) {
//                factorResult *= i;
//            }
//            result += factorResult;
//        }
//        System.out.println(result);
        //生成随机数
//        Random random = new Random();
//        //[0,100) --> + 1 --> [1,101)即[1,100]
//        int num = random.nextInt(100) + 1;
//        System.out.println(num);
        //方法
//        int result = 0;
//        for (int i = 1;i <= 5;i++) {
//            result += factor(i);
//        }
//        System.out.println(result);
//        int result = min(20,30);
//        System.out.println("最小值为：" + result);
//        for (int i = 1;i <= 100;i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//        }
        //判定1000-2000之间哪些是闰年
//        for (int year = 1000;year <= 2000;year++) {
//            if (isLeapYear(year)) {
//                System.out.println(year);
//            }
//        }
        //打印乘法口诀表
        //先按行打印
//        for (int row = 1;row <= 9;row++) {
//            printLine(row);
//        }
        //求两个正整数的最大公约数
//        int result = calcGreatestCommonDivisor(100,120);
//        System.out.println(result);
        //计算计算1/1-1/2+1/3-1/4+1/5 …… + 1/n-1 - 1/n 的值（n一定是偶数）
        //数列求和基本思路：相邻两项归为一项
//        double result = seriesSum(100);
//        System.out.println(result);
        //计算1-100中有多少个9
//        int count = calcNineCount ();
//        System.out.println(count);
        //判断一个数是否为水仙花数
        for (int i = 0;i <= 999;i++) {
            if (isNarcissusNum(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isNarcissusNum(int n) {
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        if (n == a*a*a + b*b*b + c*c*c) {
            return true;
        } else {
            return false;
        }
    }
    public static int calcNineCount() {
        int count = 0;
        for (int i = 1;i <= 100;i++) {
            if (i % 10 == 9) {
                count++;
            }
            if ((i / 10) % 10 == 0) {
                count++;
            }
        }
        return count;
    }
    public static Double seriesSum(int n) {
        double sum = 0.0;
        for (int i = 1;i <= n;i += 2) {
            sum += calcItem(i);
        }
        return sum;
    }
    public static Double calcItem(double i) {
        return 1/i - 1/(i+1);
    }
    //最大公约数
    public static int calcGreatestCommonDivisor(int a, int b) {
        //暴力搜索的方式来求解
        int min = min(a , b);
        for (int i = min;i >= 1;i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
    //打印口诀表函数
    public static void printLine(int row) {
        for (int col = 1;col <= row;col++) {
            System.out.printf("%d x %d = %d ",col,row,row*col);
        }
        System.out.println();
    }
    //闰年方法体
    public static boolean isLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }else if (year % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }
    //判定一个数是否为素数
    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2;i < num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //求两个数的最小值
    public static int min (int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    //当前的方法都统一写作 public static
//    public static int factor (int num) {
//        int result = 1;
//        for (int i = 1;i <= num;i++) {
//            result *= i;
//        }
//        return  result;
//    }

}
