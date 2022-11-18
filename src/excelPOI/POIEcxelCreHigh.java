package excelPOI;

import cn.hutool.core.io.FileUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.File;

class POIEcxelCreHigh {
    /**
     * POI 创建高版本Excel文件
     * @author yangtingting
     * @date 2019/07/29
     */
    public static void main(String[] args) throws Exception {
        //创建Excel文件薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        //创建工作表sheeet
        Sheet sheet = workbook.createSheet();
        //创建第一行
        Row row = sheet.createRow(0);
        String[] title = {"第三方流水号", "本次开具电费", "本次开具服务费"};
        Cell cell = null;
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }
        //追加数据
        Row nextrow = sheet.createRow(1);
        Cell cell2 = nextrow.createCell(0);
        cell2.setCellValue("MA1GW52Y2542427149368168448");
        cell2 = nextrow.createCell(1);
        cell2.setCellValue(0.1);
        cell2 = nextrow.createCell(2);
        cell2.setCellValue(0.5);

        //创建一个文件
        File file=new File("D:/poi_test1.xlsx");
        file.createNewFile();
        BufferedOutputStream stream= FileUtil.getOutputStream(file);
        workbook.write(stream);
        stream.close();

    }

}


