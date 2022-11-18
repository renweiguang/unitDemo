package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果json想转的类型是泛型，那么就用 TypeReference
 * @author renwg
 * @date 2022/7/13
 */
public class TestTypeReference {
    public static void main(String[] args) {
        testTypeReference();
    }

    static void testTypeReference() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(8);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("a", list);
        System.out.println(jsonObj);
        List<Integer> list2 = jsonObj.getObject("a", new TypeReference<List<Integer>>() {
        });
        System.out.println(list2);
    }
}
