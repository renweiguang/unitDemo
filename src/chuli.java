import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class chuli {

    public static void main(String[] args) {
        String a = "[\n"
                + "        {\n"
                + "            \"Username\":\"账户名称\",\n"
                + "            \"Enabled\":\"账户是否启用\",\n"
                + "            \"Belongs\":[\"String类型数组，第一个默认为主部门\"]\n"
                + "        },\n"
                + "{\n"
                + "            \"Username\":\"账户名称\",\n"
                + "            \"Enabled\":\"账户是否启用\",\n"
                + "            \"Belongs\":[\"String类型数组，第一个默认为主部门\"]\n"
                + "}\n"
                + "]";

        List<Entity> entityList = JSON.parseArray(a, Entity.class);

        entityList.stream().forEach(r -> {

            //            System.out.println("JsonArray ：");
            //            System.out.println(r.getBelongs());
            List<String> stringList = JSONObject.parseArray(r.getBelongs(), String.class);

            stringList.stream().forEach(r1 -> System.out.println(r1));

        });

        //            List<String> stringList = new ArrayList<>();
        //            stringList.add("String类型数组，第一个默认为主部门");
        //            System.out.println("List<String> ：");
        //            System.out.println(stringList);
        //            stringList.stream().forEach(r2-> System.out.println(r2));
    }
}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Entity {
    private String username;

    private String enable;

    private String belongs;
}
