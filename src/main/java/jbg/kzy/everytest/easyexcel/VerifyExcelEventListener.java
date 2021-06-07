package jbg.kzy.everytest.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

/**
 * mock test listener
 *
 * @author ckh
 * @date 2020/11/18.
 */
public class VerifyExcelEventListener extends AnalysisEventListener<Object> {
    @Override
    public void invoke(Object data, AnalysisContext context) {
        System.out.println(this);
        System.out.println(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("--处理完毕--");
    }
}
