public class Test6 {
    public static void main(String[] args) {
        //验证数组的有序性
        int[] arr = {2,3,4,5,6,7};
        System.out.println(isSorted(arr));
    }

    //按照升序来比较
    //依次比较数组中的两个相邻元素，如果所有的相邻元素之间都是有序的话，
    //就认为整个数组是有序的
    //只要找到一个反例，就是无序的
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1;i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
