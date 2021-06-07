package jbg.kzy.everytest.optional;

import java.util.Optional;

/**
 * @author ckh
 * @since 2021/4/11.
 */
public class TestOptional {
    private String test = "private field";
    public static void main(String[] args) {
        String o = "123";
        Optional.ofNullable(o).ifPresent(e -> {
            System.out.println(e);
        });
    }
}
