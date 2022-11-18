package fastJsonAndJsonField;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class json2ArrayTest
{
    public static void main(String[] args)
    {
        String jsonString = "[{\"plateNumber\":\"1\",\"holeNumber\":\"A02\",\"qcType\":\"L\",\"value\":\"2.36\"},{\"plateNumber\":\"1\",\"holeNumber\":\"A03\",\"qcType\":\"M\",\"value\":\"5.36\"}]";

        List<QcPlate> listQcPlate = new ArrayList<QcPlate>();

        listQcPlate = JSON.parseArray(jsonString, QcPlate.class);

        listQcPlate.stream().forEach(r-> System.out.println(r));

    }
}
