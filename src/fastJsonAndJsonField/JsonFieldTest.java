package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rwg
 * @date 2021/9/28 14:54
 */
public class JsonFieldTest {
    public static void main(String[] args) {
        ChargeStation chargeStation = new ChargeStation();
        chargeStation.setStationId("7897879");
        chargeStation.setStationNo(null);
        System.out.println(JSONObject.toJSONString(chargeStation));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(JSONObject.toJSONString(list));



    }
}
