package list;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/9/7 14:14
 */
public class TestChargeFlatMap {
    public static void main(String[] args) {

        //第一个设备下的充电枪
        List<Connector> connectors = Arrays.asList(
                new Connector("connector"),
                new Connector("connector1"),
                new Connector("connector2"),
                new Connector("connector3"));

        //第二个设备下的充电枪
        List<Connector> connectors1 = Arrays.asList(
                new Connector("connector4"),
                new Connector("connector5"),
                new Connector("connector6"),
                new Connector("connector7"));
        //第三个设备下的充电枪
        List<Connector> connectors2 = Arrays.asList(
                new Connector("connector8"),
                new Connector("connector9"),
                new Connector("connector10"),
                new Connector("connector11"));


        //设备列表
        List<EquipMent> equipMentList = Arrays.asList(new EquipMent(connectors),
                new EquipMent(connectors1),
                new EquipMent(connectors2));


        //将设备放入充电站
        ChargeStaion chargeStaion = ChargeStaion.builder().equipMentList(equipMentList).build();

//        //遍历每个充电枪
//        List<Connector> connectorList = chargeStaion
//                .getEquipMentList()
//                .stream()
//                .map(EquipMent::getConnectorList)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//
//        //输出电站下所有的充电枪
//        connectorList.stream().forEach(connector -> System.out.println(JSONObject.toJSONString(connector)));

//        Map<String, Connector> map = chargeStaion
//                .getEquipMentList()
//                .stream()
//                .map(EquipMent::getConnectorList)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toMap(Connector::getConnectorNo, Function.identity()));


        List<Connector> map = chargeStaion
                .getEquipMentList()
                .stream()
                .map(EquipMent::getConnectorList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(map);

    }
}
