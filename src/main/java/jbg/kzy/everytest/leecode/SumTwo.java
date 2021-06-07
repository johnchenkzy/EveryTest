package jbg.kzy.everytest.leecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author ckh
 * @since 2021/5/26.
 */
public class SumTwo {
    public static Integer[] sum(Integer[] inputArray, Integer target) {
        if (inputArray.length < 2) {
            return null;
        }
        List<Integer> integers = Arrays.asList(inputArray);
        integers.sort(Integer::compareTo);
        for (int j = 0; j < integers.size(); j++) {
            var integer = integers.get(j);
            if (integer > target) {
                return null;
            }
            for (int i = 1; i < integers.size(); i++) {
                var next = integers.get(i);
                int sum = integer + next;
                if (next > target || sum > target) {
                    break;
                }   
                if (sum == target) {
                    return new Integer[]{j, i};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] input = {3, 6, 11, 15};
        var result = sum(input, 17);
        if (result == null) {
            System.out.println("没有结果");
            return;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("第" + (i + 1) + "个数:" + result[i].toString());
        }
    }
}
