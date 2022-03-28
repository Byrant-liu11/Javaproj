import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {9,5,2,7,3,6,10};
        //数组逆序
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;
            left++;
            right--;
        }
    }
}
