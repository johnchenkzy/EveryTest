package jbg.kzy.everytest.reflect;

import javax.script.Bindings;
import javax.script.SimpleBindings;
import java.util.*;

/**
 * @author ckh
 * @since 2021/5/18.
 */
public class TestInterface {
    public static void main(String[] args) {
        Class<?>[] interfaces = LinkedHashMap.class.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        System.out.println("simplebindings!!");
        Class<?>[] interfaces1 = SimpleBindings.class.getInterfaces();
        for (Class<?> aClass : interfaces1) {
            System.out.println(aClass.getName());
        }
        System.out.println("bindings!!");
        Class<?>[] interfaces2 = Bindings.class.getInterfaces();
        for (Class<?> aClass : interfaces2) {
            System.out.println(aClass.getName());
        }
        if (isDeepAssignable(ArrayList.class, Collection.class)) {
            System.out.println("yyyyyyyyyyyyes!");
        }
    }

    private static boolean isDeepAssignable(Class<?> object, Class<?> target) {
        Class<?>[] interfaces = object.getInterfaces();
        for (Class<?> interfaceClass : interfaces) {
            boolean assignableFrom = target.isAssignableFrom(interfaceClass);
            if (assignableFrom) {
                return true;
            }
            if (interfaceClass.getInterfaces().length > 0) {
                boolean deepAssignable = isDeepAssignable(target, interfaceClass);
                if (deepAssignable) {
                    return true;
                }
            }
        }
        return false;
    }
}
