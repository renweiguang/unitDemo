package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;

public class YcSwitchTest {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "    \"status\": 1,\n" +
                "    \"message\": \"\",\n" +
                "    \"data\": true\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        Boolean a = jsonObject.getBoolean("data");
        System.out.println(a);
    }
}
