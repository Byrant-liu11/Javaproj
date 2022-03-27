public class Test3 {
    public static void main(String[] args) {
        //数组创建
//        int[] arr = new int[]{1,2,3,4};
//        int[] arr2 = {1,2,3,4};
//        int[] arr3 = new int[4];//指定数组的元素个数，数组元素都是0；
        //获取数组长度
//        int[] arr = {1,2,3,4,5};
        //System.out.println(arr.length);
        //根据数组下标访问数组个数
        //System.out.println(arr[2]);
        //数组的遍历
//        for (int i = 0;i < arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = arr.length - 1;i >= 0;i--) {
//            System.out.println(arr[i]);
//        }
        //Java中的for each 写法
        //针对数组这样的类型，就可以通过这种方式来完成从前往后的数组遍历
        //这种方法不能够修改数组的值
//        for (int x : arr) {
//            System.out.println(x);
//        }
//        //上面的写法等价于
//        for (int i = 0; i < arr.length;i++) {
//            int x = arr[i];
//            System.out.println(x);
//        }

        int[] arr = {1,2,3,4,5};
        //printArr(arr);
        int[] output = transform(arr);
        printArr(output);
    }
    public static int[] transform(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0;i < input.length;i++) {
            output[i] = 2 * input[i];
        }
        return output;
    }
//    public static int[] transform(int[] input) {
//        for (int i = 0;i < input.length;i++) {
//            input[i] *= 2;
//        }
//        return input;
//    }
    //打印数组的内容
    public static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
