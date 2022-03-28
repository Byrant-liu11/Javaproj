import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //直接打印数组，打印的结果只是一个“地址”类似的东西
//        System.out.println(arr);
        //数组转字符串
//        String result = arrToString(arr);
//        //格式形如[1,2,3,4,5,6]
//        System.out.println(result);
        //Java标准库提供了现成能够把数组转成String的方法
        String result = Arrays.toString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        String result = "[";
        //判定一下当前元素是否为最后一个，如果是，就不加逗号
//        for (int x : arr) {
//            result += (x + ", ");
//        }
        for (int i = 0;i <= arr.length - 1;i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            } else {
                result += "";
            }
        }
        result += "]";
        return result;
    }

}
