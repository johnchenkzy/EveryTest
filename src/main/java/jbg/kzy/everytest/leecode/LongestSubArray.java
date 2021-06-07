package jbg.kzy.everytest.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量0和1的最长连续子数组。
 * 示例 2:
 * <p>
 * 输入: nums = [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。
 *
 * @author ckh
 * @since 2021/6/3.
 */
public class LongestSubArray {
    public static void main(String[] args) {
        System.out.println(getLongestSubArray(new int[]{0, 1, 0, 1, 0,1}));
    }

    public static int getLongestSubArray(int[] nums) {
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0, -1);
        int count = 0;
        int length = nums.length;
        int maxLength = 0;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (num == 0) {
                count--;
            } else {
                count++;
            }
            if (sum.containsKey(count)) {
                maxLength = Math.max(maxLength, i - sum.get(count));
            } else {
                sum.put(count, i);
            }
        }

        return maxLength;
    }
}
