package jsonField;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class JSONFieldTest
{

    @JSONField(name = "jsonName")
    private String name;
    @JSONField(name = "jsonAge")
    private String age;
    private String email;

    public static void main(String[] args)
    {
        JSONFieldTest jsonFieldTest = new JSONFieldTest();
        jsonFieldTest.setAge("21岁");
        jsonFieldTest.setEmail("111@11.com");
        jsonFieldTest.setName("hhh");

        System.out.println(JSONObject.toJSONString(jsonFieldTest));
        //输出了：{"jsonName":"hhh","jsonAge":"21岁","email":"111@11.com"}
    }

}

