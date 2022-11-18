package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/8/27 15:47
 */
public class YCtest {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"status\": 1,\n" +
                "  \"message\": \"成功\",\n" +
                "  \"data\": {\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"trimId\": 2715,\n" +
                "        \"checkStatus\": 1,\n" +
                "        \"topicId\": 930\n" +
                "      },\n" +
                "      {\n" +
                "        \"trimId\": 2716,\n" +
                "        \"checkStatus\": 1,\n" +
                "        \"topicId\": 932\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        JSONObject result = JSONObject.parseObject(jsonObject.getString("data"));

        JSONArray jsonArray = JSONObject.parseArray(result.getString("result"));

//        JSONObject jsonObject1 = new JSONObject();
//        jsonObject1.put("yuqianmianbutong", 2);
//        jsonArray.add(jsonObject1);

//        System.out.println(jsonArray);


        List<Map<String, Object>> list1 = jsonArray.stream().map(r -> {
            Map<String, Object> data = (Map) r;
            return data;
        }).collect(Collectors.toList());
        System.out.println(list1.size());

        list1.stream().forEach(r -> {
            r.forEach((k, v) -> {
                System.out.println(k);
                System.out.println(v);
            });
        });


//        list1.stream().forEach(r-> System.out.println(r));


//        List<Object> list = jsonArray.stream().map(r -> {
//            if (2715 == ((JSONObject) r).getInteger("trimId")) {
//                ((JSONObject) r).put("abd", "rwg");
//            }
//            return r;
//        }).collect(Collectors.toList());
//
//        list.stream().forEach(r -> System.out.println(r));
    }
}
