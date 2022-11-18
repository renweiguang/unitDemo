package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class JSONObjectTest {

    public static void main(String[] args) {
        String jsonString = "{\"birthday\":1607564748812,\"sex\":\"男\",\"yyy\":\"明明\",\"xxx\":1,\"age\":1}";
        System.out.println(jsonString);

        People people = JSONObject.parseObject(jsonString, People.class);
        System.out.println("String格式的json字符串转为实体类为:" + people);

        JSONObject jsonObjectString = JSONObject.parseObject(jsonString);
        System.out.println("String格式的json字符串转为JsonObject格式的json字符串为：" + jsonObjectString);

        String jsonString1 = JSONObject.toJSONString(jsonObjectString);
        System.out.println(jsonString.equals(jsonString1));

        if (jsonString.equals(String.valueOf(jsonObjectString))) {
            System.out.println("json字符串和JsonObject格式的json字符串一模一样");
        }

        //创建JSON对象
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("age", 1);
        jsonObject.put("name", "明明");
        jsonObject.put("sex", "男");
        jsonObject.put("birthday", new Date());
        System.out.println("json字符串为：");
        System.out.println(jsonObject);
        System.out.println(jsonObject.toJSONString());

        String name1 = jsonObject.getString("name");
        System.out.println("获取json字符串中的name为：" + name1);

        System.out.println("将json字符串转换为map 去遍历");
        Set<Map.Entry<String, Object>> a = jsonObject.entrySet();
        for (Map.Entry<String, Object> map : a) {
            System.out.println("map的key为：" + map.getKey() + "      map的value为：" + map.getValue());
        }

        //将JSON格式转换为Object
        People jsonToObject = JSONObject.toJavaObject(jsonObject, People.class);
        System.out.println("将JSON转换为Object：");
        System.out.println(jsonToObject.toString() + "\n");

        //将Object转换为JSON字符串
        String objectToStr = JSONObject.toJSONString(jsonToObject);
        System.out.println("将Object转换为JSON字符串：");
        System.out.println(objectToStr + "\n");

        //将JSON字符串转换为JSON格式
        JSONObject strToJson = JSONObject.parseObject(objectToStr);
        System.out.println(strToJson);
        //通过JSONObject获取属性
        System.out.println("名称为：" + jsonObject.getString("name"));
        int id = (int) strToJson.get("id");
        int age = (int) strToJson.get("age");
        String name = (String) strToJson.get("name");
        String sex = (String) strToJson.get("sex");
        Date birthday = new Date((long) strToJson.get("birthday"));
        System.out.println("字符串转换为JSON格式：");
        System.out.println("通过JSON对象获取到的属性：id：" + id + ",age:" + age + ",name:" + name + ",sex:" + sex + "," + birthday);
    }
}