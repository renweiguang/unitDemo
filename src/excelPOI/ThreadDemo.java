package excelPOI;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import http.DataDTO;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author renwg
 * @date 2022/2/17
 */
public class ThreadDemo {
    public static void main(String[] args) throws IOException, InvalidFormatException, InterruptedException {
        //创建Excel，读取文件内容
        File file = new File("C:\\Users\\renwg\\Desktop\\xxx.xlsx");
        XSSFWorkbook workbookk = new XSSFWorkbook(new File(String.valueOf(file)));
        //两种方式读取工作表
        // Sheet sheet=workbook.getSheet("Sheet0");
        Sheet sheett = workbookk.getSheetAt(0);
        //获取sheet中最后一行行号
        List<Integer> list = new ArrayList<>();

        int lastRowNum = sheett.getLastRowNum();
        for (int i = 0; i <= lastRowNum; i++) {
            Row row = sheett.getRow(i);
            //获取当前行最后单元格列号
            int lastCellNum = row.getLastCellNum();
            for (int j = 0; j < 1; j++) {
                Cell cell = row.getCell(j);
                double value = cell.getNumericCellValue();
                list.add(Integer.valueOf((int) value));
            }
        }

        List<DataDTO> list2 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            List<Integer> newList = new ArrayList<>();
            if (j == 0) {
                newList = list.subList(0, 499);
            } else {
                newList = list.subList(j * 500 - 1, j * 500 + 499);
            }
            StringBuffer sb = new StringBuffer();
            for (Integer a : newList) {
                sb.append(a + ",");
            }
            String param = sb.toString();

            HttpGet loginGet = new HttpGet("http://carwebapi.yiche.com/car/api/style/v3/getcarstyleinfo?carId=" + param.substring(0, param.length() - 1) + "&app_ver=10.26.0");

            //把参数放入请求对象，，post发送的参数list，指定格式
            CloseableHttpClient client = HttpClients.createDefault();
            CloseableHttpResponse response = client.execute(loginGet);
            //启动执行请求，并获得返回值
            //得到返回的entity对象
            HttpEntity entity = response.getEntity();
            //把实体对象转换为string
            String result = EntityUtils.toString(entity, "UTF-8");
            //返回内容
            List<DataDTO> list1 = JSON.parseArray(JSONObject.parseObject(result).getString("data"), DataDTO.class);
            list2.addAll(list1);

            Thread.sleep(5000);
        }


        //创建Excel文件薄
        XSSFWorkbook workbook1 = new XSSFWorkbook();
        //创建工作表sheeet
        Sheet sheet1 = workbook1.createSheet();
        //创建第一行
        Row row = sheet1.createRow(0);
        String[] title = {"车款ID", "车型名称", "是否为新能源"};
        Cell cell = null;
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }
        //追加数据
        for (int i = 1; i < list2.size(); i++) {
            Row nextrow = sheet1.createRow(i);
            Cell cell2 = nextrow.createCell(0);
            cell2.setCellValue(list2.get(i - 1).getCarId());
            cell2 = nextrow.createCell(1);
            cell2.setCellValue(list2.get(i - 1).getCarName());
            cell2 = nextrow.createCell(2);
            cell2.setCellValue(list2.get(i - 1).isElectricCar());
        }
        //创建一个文件
        File file1 = new File("D:/14.xlsx");
        file1.createNewFile();
        BufferedOutputStream stream = FileUtil.getOutputStream(file1);
        workbook1.write(stream);
        stream.close();
    }
}
