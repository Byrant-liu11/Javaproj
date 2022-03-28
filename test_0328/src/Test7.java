import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        //冒泡排序（升序来算）
        //一趟比较下来，就可以将最大的元素放到最后，或将最小的元素放到最前
        int[] arr = {9,5,2,7,3,6};
        bubbleSort(arr);
        //Java标准库中提供了一个现成的排序算法Array.sort()
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //这个代码，可以直接在方法内部修改数组的内容
    //也可以创建新数组，以返回值的方式返回新数组
    //数组这样的类型，在方法内部做出修改，也能影响到实参的内容
    public static void bubbleSort(int[] arr) {
        //如果从前往后遍历进行比较交换，就把最大元素放到最后
        //如果从后往前遍历进行比较交换，就把最小元素放到最前
        //[0,bound)已排序区间
        //[bound,length)待排序区间
        for (int bound = 0;bound < arr.length;bound++) {
            for (int cur = 0;cur < arr.length - bound - 1;cur++) {
                if (arr[cur] > arr[cur + 1]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[cur + 1];
                    arr[cur + 1] = tmp;
                }
            }
        }
    }
}
