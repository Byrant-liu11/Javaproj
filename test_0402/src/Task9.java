import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = copyof(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] copyof(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0;i < arr.length;i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
