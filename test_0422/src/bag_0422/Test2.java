package bag_0422;

import java.util.ArrayList;
import java.util.List;

//打印杨辉三角
public class Test2 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            //返回一个空的List
            return new ArrayList<>();
        }
        //result用来表示最终结果，这个result中就包含了若干行
        List<List<Integer>> result = new ArrayList<>();
        //处理第一行，就是固定一个1
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            return result;
        }
        //处理第二行
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }
        //处理后面第i行
        //每一行第一个元素和最后一个元素都是1
        //每一行的列数都是和行数相同
        for (int row = 3;row <= numRows;row++) {
            //当前行是row，上一行为row-1
            //此处的row是从1开始计算的，而List下标是从0开始算的，还需要再-1
            //不建议写成row-2
            List<Integer> prevLine = result.get(row -1 - 1);
            List<Integer> currentLine = new ArrayList<>();
            //第一列
            currentLine.add(1);
            //当前列
            for (int col = 2;col <= row - 1;col++) {
                int num = prevLine.get(col - 1);
                int num2 = prevLine.get(col - 1 - 1);
                currentLine.add(num + num2);
            }
            //最后一列
            currentLine.add(1);
            result.add(currentLine);
        }
        return result;
    }
}
