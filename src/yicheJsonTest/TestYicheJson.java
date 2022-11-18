package yicheJsonTest;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author rwg
 * @date 2021/10/28 15:29
 */
public class TestYicheJson {
    public static void main(String[] args) {
        String ycJsonString = "{\n" +
                "    \"status\":1,\n" +
                "    \"message\":\"\",\n" +
                "    \"data\":{\n" +
                "        \"stationNo\":\"1368755934414901248\",\n" +
                "        \"stationName\":\"直连QA测试专用站\",\n" +
                "        \"connectorNo\":\"1368759870421078030\",\n" +
                "        \"connectorId\":\"01222022004001\",\n" +
                "        \"periodPrice\":[\n" +
                "            {\n" +
                "                \"stationNo\":\"1368755934414901248\",\n" +
                "                \"startTime\":\"00:00\",\n" +
                "                \"endTime\":\"19:00\",\n" +
                "                \"servicePrice\":0.73,\n" +
                "                \"electricityPrice\":0.5,\n" +
                "                \"price\":3\n" +
                "            },\n" +
                "            {\n" +
                "                \"stationNo\":\"1368755934414901248\",\n" +
                "                \"startTime\":\"19:00\",\n" +
                "                \"endTime\":\"19:30\",\n" +
                "                \"servicePrice\":0.69,\n" +
                "                \"electricityPrice\":0.54,\n" +
                "                \"price\":2\n" +
                "            },\n" +
                "            {\n" +
                "                \"stationNo\":\"1368755934414901248\",\n" +
                "                \"startTime\":\"19:30\",\n" +
                "                \"endTime\":\"23:59\",\n" +
                "                \"servicePrice\":0.26,\n" +
                "                \"electricityPrice\":0.33,\n" +
                "                \"price\":5\n" +
                "            }\n" +
                "        ],\n" +
                "        \"currentPeriodPrice\":{\n" +
                "            \"stationNo\":\"1368755934414901248\",\n" +
                "            \"startTime\":\"00:00\",\n" +
                "            \"endTime\":\"19:00\",\n" +
                "            \"servicePrice\":0.73,\n" +
                "            \"electricityPrice\":0.5,\n" +
                "            \"price\":1.23\n" +
                "        },\n" +
                "        \"parkingStationVO\":{\n" +
                "            \"status\":6,\n" +
                "            \"context\":\"限时免费\",\n" +
                "            \"waiverType\":1,\n" +
                "            \"note\":\"该场站充电即可免费停车30分钟\",\n" +
                "            \"duration\":30,\n" +
                "            \"isSuccess\":false\n" +
                "        },\n" +
                "        \"tips\":\"1. 充电需要预付充电款项 \\n 2. 充电完成后，剩下的款项将原路退回到您的账户中 \\n 3. 充电启动时，停止充电会导致订单异常，切勿停止\",\n" +
                "        \"id\":106,\n" +
                "        \"carNum\":\"京Q000000\"\n" +
                "    }\n" +
                "}";

        Response response = JSONObject.parseObject(ycJsonString, Response.class);
        System.out.println(response.getData().getTips());
        Map<String, BigDecimal> map = response.getData().getPeriodPrice().stream().collect(Collectors.toMap(PeriodPrice::getStartTime, PeriodPrice::getElectricityPrice));
        map.forEach((k, v) -> {
            System.out.println("key:" + k + "  " + "value:" + v);
        });
        Map<BigDecimal, List<PeriodPrice>> map1 = response.getData().getPeriodPrice().stream().collect(Collectors.groupingBy(PeriodPrice::getElectricityPrice));
        System.out.println(map1.get(new BigDecimal(0.5)));

        System.out.println(response.getData().getPeriodPrice().stream().map(PeriodPrice::getPrice).reduce(Integer::sum).orElse(0));
    }
}
