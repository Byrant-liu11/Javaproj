public class Task8 {
    public static void main(String[] args) {
        //二分查找只适用于有序数组；
        int[] arr = {3,5,7,9,10};
        int pos = binarySort(arr,7);
        System.out.println(pos);
    }

    public static int binarySort(int[] arr, int toSearch) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toSearch < arr[mid]) {
                //right--;
                right = mid - 1;
            } else if (toSearch > arr[mid]) {
                //left++;
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
