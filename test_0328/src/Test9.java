import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {9,4,2,7,3,6,10};
        //对数组进行重新排列
        //排列之后偶数在前，奇数在后
        //从前往后排列，找到一个奇数
        //再从后往前，找到一个偶数
        //交换这两元素，直到两个下标重合
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
    }
}
