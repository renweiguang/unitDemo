//package fastJsonAndJsonField;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.List;
//
//public class AliJsonTest
//{
//    public static void main(String[] args)
//    {
//        JSONArray jsonArray = new JSONArray();
//        String result = "{\n"
//                + "    \"success\": true,\n"
//                + "    \"code\": \"200\",\n"
//                + "    \"message\": null,\n"
//                + "    \"requestId\": \"2AEAD83D-AE05-4ABF-A4DD-FAA355D56884\",\n"
//                + "    \"data\": {\n"
//                + "        \"organizations\": [\n"
//                + "            {\n"
//                + "                \"organizationName\": \"zhangd222h\",\n"
//                + "                \"externalId\": \"root4111233\",\n"
//                + "                \"parentExternalId\": \"root411122\",\n"
//                + "                \"type\": \"DEPARTMENT\",\n"
//                + "                \"rootNode\": false,\n"
//                + "                \"sortNumber\": 3,\n"
//                + "                \"enabled\": true,\n"
//                + "                \"description\": \"负责产品研发\",\n"
//                + "                \"extendFields\": {\n"
//                + "                    \"ddtalkId\": \"\"\n"
//                + "                },\n"
//                + "                \"uuid\": \"a9c2e069015b3fe72e5a31791521d6115m8Aup4Kaah\",\n"
//                + "                \"parentUuid\" : \"root\"\n"
//                + "            },\n"
//                + "            {\n"
//                + "                \"organizationName\": \"zhangd222h\",\n"
//                + "                \"externalId\": \"root411123\",\n"
//                + "                \"parentExternalId\": \"root4111233\",\n"
//                + "                \"type\": \"DEPARTMENT\",\n"
//                + "                \"rootNode\": false,\n"
//                + "                \"sortNumber\": 3,\n"
//                + "                \"enabled\": true,\n"
//                + "                \"description\": \"负责产品研发\",\n"
//                + "                \"extendFields\": {\n"
//                + "                    \"ddtalkId\": \"\"\n"
//                + "                },\n"
//                + "                \"uuid\": \"b92d5c521ac22538ee05eb2113d3fc33dV8LCA7h2tW\",\n"
//                + "                \"parentUuid\" : \"root\"\n"
//                + "            }\n"
//                + "        ]\n"
//                + "    }\n"
//                + "}";
//
//        JSONObject jsonObject1 = JSONObject.parseObject(result);
//
//        String data = jsonObject1.getString("data");
//
//
//
//        List<AliOrganizationResDTO> list = JSONObject.parseArray(organization,AliOrganizationResDTO.class);
//        list.stream().forEach(r ->
//        {
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("DISP_NAME", r.getOrganizationName());
//            jsonObject.put("UNIT_PATH", r.getParentExternalId());
//            jsonObject.put("UNIT_CODE", r.getExternalId());
//            jsonArray.add(jsonObject);
//        });
//
//
//
//        System.out.println(jsonArray);
//    }
//}
