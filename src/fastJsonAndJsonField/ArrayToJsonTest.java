package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

public class ArrayToJsonTest {
    public static void main(String[] args) {
        List<QcPlate> list = Arrays.asList(new QcPlate("1", "A02", "L", "2.36"),
                new QcPlate("1", "A03", "M", "5.36"));

        JSONArray jsonArray = new JSONArray();

        list.stream().forEach(r -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("plateNumber", r.getPlateNumber());
            jsonObject.put("holeNumber", r.getHoleNumber());
            jsonObject.put("qcType", r.getQcType());
            jsonObject.put("value", r.getValue());
            jsonArray.add(jsonObject);
        });

        String jsonString = jsonArray.toJSONString();

        System.out.println(jsonString);
    }
}
