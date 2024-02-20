package asyn;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author renwg
 * @Date 2023/12/27 17:03
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();

        list.add(null);

        if(CollectionUtils.isEmpty(list)){
            System.out.println(1);
        }
    }
}