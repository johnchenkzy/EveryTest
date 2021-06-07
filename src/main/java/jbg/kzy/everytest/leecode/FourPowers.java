package jbg.kzy.everytest.leecode;

/**
 * @author ckh
 * @since 2021/5/31.
 */
public class FourPowers {
    public static void main(String[] args) {
        System.out.println(isFourPowers(1));
    }

    public static boolean isFourPowers(int number) {
        if (number == 1) {
            return true;
        }
        if (number >= 4 && number % 4 == 0) {
            return isFourPowers(number / 4);
        } else {
            return false;
        }
    }
}
