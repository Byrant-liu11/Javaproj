import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        changeArray(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void changeArray(int[] arr1, int[] arr2) {
        for (int i = 0;i < arr1.length;i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
}
