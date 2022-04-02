public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int result = sum(arr);
        System.out.println(result);
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int x : arr) {
            result += x;
        }
        return result;
    }
}
