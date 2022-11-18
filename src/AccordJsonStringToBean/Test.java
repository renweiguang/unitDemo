package AccordJsonStringToBean;

import com.alibaba.fastjson.JSONObject;

public class Test
{
    public static void main(String[] args)
    {
        String jsonString = "{\n"
                + "    \"CmdOpt\":{\n"
                + "        \"Header\":{\n"
                + "            \"DataFormat\":\"FPT0500\",\n"
                + "            \"Version\":\"AXIS0100\"\n"
                + "        },\n"
                + "        \"CmdParam\":[\n"
                + "            {\n"
                + "                \"Type\":\"MatchTask\",\n"
                + "                \"Group\":[\n"
                + "                    {\n"
                + "                        \"Type\":\"TaskInfo\",\n"
                + "                        \"Item\":[\n"
                + "                            {\n"
                + "                                \"Key\":\"TASK_ID\",\n"
                + "                                \"Value\":\"4407036100002016110632\"\n"
                + "                            }\n"
                + "                        ]\n"
                + "                    }\n"
                + "                ]\n"
                + "            },\n"
                + "                {\n"
                + "                \"Type\":\"Cand\",\n"
                + "                \n"
                + "                        \"Item\":[\n"
                + "                            {\n"
                + "                                \"Key\":\"CAND_NO\",\n"
                + "                                \"Value\":\"1\"\n"
                + "                            }\n"
                + "                        ]\n"
                + "            }\n"
                + "        ]\n"
                + "    }\n"
                + "}";

        AxisCallParam axisCallParam = JSONObject.parseObject(jsonString, AxisCallParam.class);

        System.out.println(JSONObject.toJSONString(axisCallParam));
    }
}
