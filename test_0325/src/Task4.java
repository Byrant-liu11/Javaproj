public class Task4 {
    public static void main(String[] args) {
        int result1 = max2(2,3);
        System.out.println("两个数中的最大值为：" + result1);
        int result2 = max3(3,2,7);
        System.out.println("三个数中的最大值为：" + result2);
    }
    public static int max3(int a,int b,int c) {
        return max2(max2(a,b),c);
    }
    public static int max2(int a,int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
