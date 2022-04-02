public class Task7 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9};
        boolean result =  isSort(arr);
        System.out.println(result);
    }

    public static boolean isSort(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] < arr[i+1]) {
                return true;
            }
        }
        return false;
    }
}
