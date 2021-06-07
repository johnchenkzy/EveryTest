package jbg.kzy.everytest.reflect;

import jbg.kzy.everytest.optional.TestOptional;

import java.lang.reflect.*;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * test method
 *
 * @author ckh
 * @since 2021/4/12.
 */
public class TestMethod {

    private String test = "private test";
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        TestOptional a = new TestOptional();
        Class<? extends TestOptional> aClass = a.getClass();
        Field test = aClass.getDeclaredField("test");
        test.setAccessible(true);
        System.out.println(test.get(a));
    }

    public Map<String,Object> test(String aaa, String bbbb) {
        System.out.println(aaa + bbbb);
        return null;
    }
}
