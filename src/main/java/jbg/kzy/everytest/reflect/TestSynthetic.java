package jbg.kzy.everytest.reflect;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author ckh
 * @since 2021/4/29.
 */
public class TestSynthetic {
    public static void main(String[] args) {
        Class a = BigInteger.class;
        Method[] methods = a.getMethods();
        for (Method method : methods) {
            if (method.isSynthetic()) {
                System.out.println(method.getName() + "@" + Arrays.toString(method.getGenericParameterTypes()));
            }
        }
    }
}
