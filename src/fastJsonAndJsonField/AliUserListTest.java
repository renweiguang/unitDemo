package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class AliUserListTest {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        String result = "{\n"
                + "    \"success\": true,\n"
                + "    \"code\": \"200\",\n"
                + "    \"message\": null,\n"
                + "    \"requestId\": \"BEEBF480-8AFB-43AF-9F70-AA0F9F98551B\",\n"
                + "    \"data\": {\n"
                + "        \"list\": [\n"
                + "            {\n"
                + "                \"externalId\": \"9559463518063400923647841824713574087502\",\n"
                + "                \"username\": \"3702841994xxxxxxxx\",\n"
                + "                \"displayName\": \"张一\",\n"
                + "                \"phoneNumber\": \"1826663xxxx\",\n"
                + "                \"phoneRegion\": \"86\",\n"
                + "                \"email\": null,\n"
                + "                \"locked\": false,\n"
                + "                \"enabled\": true,\n"
                + "                \"description\": \"\",\n"
                + "                \"extendFields\": {\n"
                + "                    \"USER_JOB_DESC\": \"xxxx派出所\",\n"
                + "                    \"zj\": \"科员\",\n"
                + "                    \"USER_SEX\": \"10\",\n"
                + "                    \"USER_TYPE\": \"10\",\n"
                + "                    \"USER_POLICE_ID\": \"xxxx242\",\n"
                + "                    \"PHONE\": \"0532-665xxxx\",\n"
                + "                    \"USER_PART_TYPE\": \"30\",\n"
                + "                    \"USER_STATU\": \"在用\",\n"
                + "                    \"bgzx\": \"9223-8xxxx\"\n"
                + "                },\n"
                + "                \"belongs\": [\n"
                + "                    \"370285330000\"\n"
                + "                ]\n"
                + "            },\n"
                + "            {\n"
                + "                \"externalId\": \"1036185697034548950140469340027342306144\",\n"
                + "                \"username\": \"3702121978xxxxxxX\",\n"
                + "                \"displayName\": \"张xx\",\n"
                + "                \"phoneNumber\": \"176675xxxxx\",\n"
                + "                \"phoneRegion\": \"86\",\n"
                + "                \"email\": null,\n"
                + "                \"locked\": false,\n"
                + "                \"enabled\": true,\n"
                + "                \"description\": \"\",\n"
                + "                \"extendFields\": {\n"
                + "                    \"USER_SEX\": \"10\",\n"
                + "                    \"USER_TYPE\": \"10\",\n"
                + "                    \"USER_POLICE_ID\": \"159xxxx\",\n"
                + "                    \"USER_PART_TYPE\": \"30\",\n"
                + "                    \"USER_STATU\": \"在用\"\n"
                + "                },\n"
                + "                \"belongs\": [\n"
                + "                    \"370214260000\"\n"
                + "                ]\n"
                + "            }\n"
                + "        ],\n"
                + "        \"perPageSize\": 2,\n"
                + "        \"totalSize\": 1235,\n"
                + "        \"pageNumber\": 1,\n"
                + "        \"pageSize\": 2,\n"
                + "        \"currentPage\": 1\n"
                + "     }\n"
                + "}";

        JSONObject jsonObject1 = JSONObject.parseObject(result);

        String data = jsonObject1.getString("data");

        JSONObject jsonObject2 = JSONObject.parseObject(data);

        String userList = jsonObject2.getString("list");

        List<AliUserListResDTO> list = JSONObject.parseArray(userList, AliUserListResDTO.class);

        List<String> list1 = JSONObject.parseArray(userList, String.class);
        list1.stream().forEach(r -> {
            JSONObject jsonObject = JSONObject.parseObject(r);
            System.out.println(jsonObject.getString("externalId"));
        });

        list.stream().forEach(r ->
        {
            ExtendFieldsDto jsonObject3 = r.getExtendFields();
            String userSex = jsonObject3.getUserSex();
            //            System.out.println(userSex);

            //            r.getBelongs().stream().forEach(r1-> System.out.println(r1));

            List<String> stringList = JSONObject.parseArray(r.getBelongs(), String.class);
            //            stringList.stream().forEach(r2 -> System.out.println(r2));

            //            JSONObject jsonObject = new JSONObject();
            //            jsonObject.put("USER_ID", r.getUsername());
            //            jsonObject.put("NAME", r.getDisplayName());
            //            jsonObject.put("IS_DISABLED", r.isEnabled());
            //            jsonArray.add(jsonObject);
        });
        //        System.out.println(jsonArray.toJSONString());
    }
}
