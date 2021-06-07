package jbg.kzy.everytest.leecode;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author ckh
 * @since 2021/5/28.
 */
public class MaxSubString {
    public static void main(String[] args) {
        maxSubString("abcabcbb");
    }

    private static void maxSubString(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 1;
        int front = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            char a = chars[i];
            if (set.contains(a)) {
                if ((end - start) < (i - front)) {
                    end = i;
                    start = front;
                }
                i = ++front;
                set.clear();
            }
            set.add(a);
        }
        if (StringUtils.isNotEmpty(s)) {
            System.out.println(s.substring(start, end));
        } else {
            System.out.println(0);
        }
    }
}
