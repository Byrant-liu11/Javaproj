package bag_0422;

import java.util.List;

//给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
//如果存在，请返回 true ；否则，返回 false 。
public class Test1 {
    public boolean threeConsecutiveOdds(int[] arr) {
        //遍历数组，找到所有可能存在的序列，并判断就可以了
        for (int i = 0;i < arr.length - 2;i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    //List版本
    public boolean threeConsecutiveOdds(List<Integer> arr) {
        for (int i = 0;i < arr.size() - 2;i++) {
            if (arr.get(i) % 2 != 0 && arr.get(i+1) % 2 != 0 && arr.get(i+2) % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
