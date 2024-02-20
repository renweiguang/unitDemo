import java.util.ArrayList;
import java.util.List;

public class aaa {
    public static void main(String[] args) {
        System.out.println("jdbc:mysql://mysql01-ec-test-bj2.ybm100.top:3308/xyy_ec_search?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8".equals("jdbc:mysql://mysql01-ec-test-bj2.ybm100.top:3308/xyy_ec_search?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8"));
        System.out.println("jdbc:mysql://mysql01-ec-test-bj2.ybm100.top:3308/xyy_ec_search?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8".substring(13));



        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list.remove(0));
    }
}
