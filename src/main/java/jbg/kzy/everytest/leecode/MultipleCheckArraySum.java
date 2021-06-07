package jbg.kzy.everytest.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 示例 1：
 * <p>
 * 输入：nums = [23,2,4,6,7], k = 6
 * 输出：true
 * 解释：[2,4] 是一个大小为 2 的子数组，并且和为 6 。
 * 示例 2：
 * <p>
 * 输入：nums = [23,2,6,4,7], k = 6
 * 输出：true
 * 解释：[23, 2, 6, 4, 7] 是大小为 5 的子数组，并且和为 42 。
 * 42 是 6 的倍数，因为 42 = 7 * 6 且 7 是一个整数。
 * 示例 3：
 * <p>
 * 输入：nums = [23,2,6,4,7], k = 13
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/continuous-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author ckh
 * @since 2021/6/2.
 */
public class MultipleCheckArraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{23,2,4,6,7};
        System.out.println(checkSubarraySum2(nums, 6));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkSubarraySum2(int[] nums, int k) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }
        Map<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = (sum + nums[i]) % k;
            if (modMap.containsKey(sum)) {
                int pos = modMap.get(sum);
                if (i - pos >= 2) {
                    return true;
                }
            } else {
                modMap.put(sum, i);
            }
        }
        return false;
    }
}
