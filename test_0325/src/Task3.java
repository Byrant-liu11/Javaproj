public class Task3 {
    public static void main(String[] args) {
        //求两个数的最大值
        //求两个整数的最大值
        int maxValue1 = max1(3,5);
        System.out.println("两个整数的较大值为：" + maxValue1);
        //求两个小数的最大值
        double maxValue2 = max2(3.3,5.5);
        System.out.println("两个小数的较大值为：" + maxValue2);
        //比较两个小数和一个整数的大小关系
        relationPrint(3,5.5,2.2);
    }
    public static void relationPrint(int a,double b,double c) {
        double ma1 = a > b ? a : b;
        double ma2 = ma1 > c ? ma1 : c; //输出最大值
        double mi1 = a > b ? b : a;
        double mi2 = mi1 > c ? c : mi1; //输出最小值
        double md = a + b + c - ma2 - mi2;
        System.out.println(ma2 + ">" + md + ">" + mi2);
    }
    public static int max1(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static double max2(double a,double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
