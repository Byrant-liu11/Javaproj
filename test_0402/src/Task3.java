import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = transform(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] transform(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
