package jbg.kzy.everytest.stringdeal;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;

/**
 * Test StringUtils
 *
 * @author ckh
 * @since 2020/12/11.
 */
public class TestStringUtils {
    public static void main(String[] args) {
        String a = "jbg.kzy.everytest.stringdeal.outside.upc.service";
        System.out.println(a.substring(a.indexOf("outside.")).split("\\.")[1]);
    }
    protected static String fillupFigure(String instr, int num, String str)
    {
        StringBuilder strbuf = new StringBuilder();
        int len = instr.length();
        if (len < num)
        {
            for (int i = 0; i < (num - len); i++)
            {
                strbuf.append(str);
            }
        }
        else if (len > num) // 该逻辑按原函数逻辑处理
        {
            instr = instr.substring(len - num);
        }
        strbuf.append(instr);
        return strbuf.toString();
    }

}
