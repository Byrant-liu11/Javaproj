public class Test5 {
    public static void main(String[] args) {
        //“查找”有两种风格
        //1.给定位置，查找值
        //2.给定值，查找位置（数组下标）
        //查找数组元素的位置
        //int[] arr = {8,5,6,9,3,7,1};
        //int pos = search(arr,3);
        //System.out.println(pos);

        //二分查找
        //二分查找必须应用于有序数组
        int[] arr = {2,3,4,5,7,13};
        int pos = binarySearch(arr,5);
        System.out.println(pos);
    }

    //直接去整个数组的中间元素，用中间元素和待查找元素进行对比
    public static int binarySearch(int[] arr, int toSearch) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toSearch < arr[mid]) {
                //左侧区间查找，淘汰掉右侧区间
                right = mid - 1;
            } else if (toSearch > arr[mid]) {
                //右侧区间查找，淘汰掉左侧区间
                left = mid + 1;
            } else {
                //相等
                return mid;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int toSearch) {
        for (int i = 0;i <= arr.length - 1;i++) {
            if (arr[i] == toSearch) {
                return i;
            }
        }
        //返回-1表示没找到
        return -1;
    }
}
