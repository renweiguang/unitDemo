package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class test {
    public static void main(String[] args) {
        String jsonString = "{\n"
                + "    \"success\": true,\n"
                + "    \"code\": \"200\",\n"
                + "    \"message\": null,\n"
                + "    \"requestId\": \"3D42DDD7-B2C6-4D10-94F7-7FAEAD8D0E33\",\n"
                + "    \"data\": {\n"
                + "        \"externalId\": \"4544224858182154114\",\n"
                + "        \"username\": \"qdga-jzzzw\",\n"
                + "        \"displayName\": \"经侦指掌纹自动识别系统\",\n"
                + "        \"phoneNumber\": null,\n"
                + "        \"phoneRegion\": \"86\",\n"
                + "        \"email\": \"qdgajzzzw@163.com\",\n"
                + "        \"locked\": false,\n"
                + "        \"enabled\": true,\n"
                + "        \"description\": \"\",\n"
                + "        \"extendFields\": {},\n"
                + "        \"belongs\": [\n"
                + "            \"6096335190559271858L\"\n"
                + "        ]\n"
                + "    }\n"
                + "}";

        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        String data = jsonObject.getString("data");
        JSONObject jsonObject1 = JSONObject.parseObject(data);
        String belongs = jsonObject1.getString("belongs");
        List<String> list = JSONArray.parseArray(belongs, String.class);
        System.out.println(list);

    }
}
