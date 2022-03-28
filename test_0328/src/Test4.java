public class Test4 {
    public static void main(String[] args) {
        //求数组平均值
        int[] arr = {9,3,4,5,1,8,6,10};
        double result = avg(arr);
        System.out.println(result);
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / arr.length;
    }
}
