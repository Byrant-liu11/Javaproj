public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,9};
        double result = avg(arr);
        System.out.println(result);
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int i = 0;i < arr.length;i++) {
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }
}
