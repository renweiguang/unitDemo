package http;

import com.alibaba.fastjson.JSONObject;

public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        user.setName("rwg");
        user.setPwd("156");
        System.out.println(user);

        //覆盖操作
        String jsonString = "{\n"
                + "    \"name\":\"rwgggggggggggg\",\n"
                + "    \"pwd\":\"8763\"\n"
                + "}";

        user = JSONObject.parseObject(jsonString, User.class);
        System.out.println(user);

    }
}
