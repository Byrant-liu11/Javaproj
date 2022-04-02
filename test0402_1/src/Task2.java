import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,1,4,10};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
    }
}
