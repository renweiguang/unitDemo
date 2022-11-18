package excelPOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author renwg
 * @date 2022/2/16
 */
public class POIExcelReadHigh {
    /**
     * POI 读取高版本Excel文件
     * @author yangtingting
     * @date 2019/07/29
     */
    public static void main(String[] args) throws Exception {
        //创建Excel，读取文件内容
        File file=new File("C:\\Users\\renwg\\Desktop\\xxx.xlsx");
         XSSFWorkbook workbook=new XSSFWorkbook(new File(String.valueOf(file)));
        //两种方式读取工作表
        // Sheet sheet=workbook.getSheet("Sheet0");
        Sheet sheet=workbook.getSheetAt(0);
        //获取sheet中最后一行行号
        List<Integer> list = new ArrayList<>();

        int lastRowNum=sheet.getLastRowNum();
        for (int i=1;i<=lastRowNum;i++){
            Row row=sheet.getRow(i);
            //获取当前行最后单元格列号
            int lastCellNum=row.getLastCellNum();
            for (int j=0;j<1;j++){
                Cell cell=row.getCell(j);
                double value = cell.getNumericCellValue();
                list.add(Integer.valueOf((int) value));
            }
        }

        System.out.println(list.subList(0,100).size());


        System.out.println(list);

        StringBuffer sb = new StringBuffer();
        for(Integer a : list){
            sb.append(a + ",");
        }
        System.out.println(sb.toString());
    }
}