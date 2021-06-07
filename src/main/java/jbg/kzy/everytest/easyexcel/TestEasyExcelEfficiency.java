package jbg.kzy.everytest.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;

import java.sql.Timestamp;

/**
 * 测试效能
 *
 * @author ckh
 * @since 2020/11/18.
 */
public class TestEasyExcelEfficiency {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        VerifyExcelEventListener listener = new VerifyExcelEventListener();
        String pathName = "C:\\Users\\JohnChen\\Desktop\\INDIGRPUSERREG.xls";
        ExcelReaderSheetBuilder sheet = EasyExcel.read(pathName, listener).sheet();
        sheet.doRead();
        long useTime = System.currentTimeMillis() - start;
        System.out.println(useTime);
    }
}
