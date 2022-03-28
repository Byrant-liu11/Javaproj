import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //数组拷贝
//        int[] arr2 = copyArray(arr);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        arr[0] = 10;
        System.out.println(arr2[0]);
    }

    public static int[] copyArray(int[] arr) {
        //首要操作，创建一个新的数组；
        int[] result = new int[arr.length];
        for (int i = 0;i <= arr.length - 1;i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
