public class Task10 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        String result = toString(arr);
        System.out.println(result);
    }

    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0;i < arr.length;i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            } else if (i == arr.length - 1) {
                result += "";
            }
        }
        result += "]";
        return result;
    }
}
