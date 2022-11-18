package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class HashMapConvertJsonString
{
    public static void main(String[] args)
    {
        Map<String, Object> map = new HashMap<>();
        map.put("app_id", "111");
        map.put("app_key", "222");
        map.put("timestamp", System.currentTimeMillis());
        System.out.println(map);
        JSONObject jsonObject = new JSONObject(map);
        System.out.println(JSONObject.toJSONString(jsonObject));
    }
}
