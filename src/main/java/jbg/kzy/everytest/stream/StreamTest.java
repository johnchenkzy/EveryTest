package jbg.kzy.everytest.stream;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ckh
 * @since 2021/5/19.
 */
public class StreamTest {
    public static void main(String[] args) {
        testCountAndReduce();
    }

    public static void testCountAndReduce() {
        Stream<Long> longStream = Stream.of(1L, 2L, null, 4L);
        Stream<Long> longStream2 = Stream.of(1L, 2L, null, 4L);
        long count = longStream.filter(Objects::nonNull).reduce(0L, Long::sum);
        long count1 = longStream2.count();
        System.out.println("reduce" + count);
        System.out.println("count" + count1);
    }
}
