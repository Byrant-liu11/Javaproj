import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {7,3,5,6,9,2,10};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr.length - i - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
