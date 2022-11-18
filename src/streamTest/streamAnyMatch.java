package streamTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author renwg
 * @date 2022/2/24
 */
public class streamAnyMatch {
    public static void main(String[] args) {

            List<String> lists = Arrays.asList("123", "456", "789", "abc", "ccc");
            boolean a = lists.stream().anyMatch(list->{
                if (list.equals("789")){
                    return true;
                }
                System.out.println(list);
                return false;
            });
        System.out.println(a);
            System.out.println("方法正在进行。。。。。");
        }

}
