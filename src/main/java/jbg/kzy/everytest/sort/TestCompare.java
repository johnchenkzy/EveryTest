package jbg.kzy.everytest.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ckh
 * @since 2021/1/8.
 */
public class TestCompare {
    public String a;
    public static void main(String[] args) {
        TestCompare a1 = new TestCompare();
        a1.a = "9001";
        TestCompare a2 = new TestCompare();
        a2.a = "8001";
        TestCompare a3 = new TestCompare();
        a3.a = "8002";
        List<TestCompare> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.sort(Comparator.comparingLong(o -> Long.parseLong(o.a)));
        for (TestCompare testCompare : list) {
            System.out.println(testCompare.a);
        }

        String t1 = "2021-05-12 17:10:51";
        String t2 = "2021-06-12 17:10:51";
        String t3 = "2020-05-12 17:10:51";
        String t4 = "2021-05-12 16:10:51";
        List<String> a = Stream.of(t1,t2,t3,t4).collect(Collectors.toList());
        a.sort(String.CASE_INSENSITIVE_ORDER);
        a.sort(Comparator.reverseOrder());
        for (String s : a) {
            System.out.println(s);
        }
    }
}
