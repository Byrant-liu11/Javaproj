public class Test3 {
    public static void main(String[] args) {
        //寻找数组中的最大元素
        int[] arr = {5, 7, 3, 8, 9, 1, 10};
        int result = max(arr);
        System.out.println(result);
    }

    //打擂台的方法，谁大谁留在台上，否则就下去
    public static int max(int[] arr) {
        int result = arr[0];
        for (int i = 0;i <= arr.length-1;i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
}
