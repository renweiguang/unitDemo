package ycJsonTest;

import com.alibaba.fastjson.JSONObject;

/**
 * @author rwg
 * @date 2021/11/3 18:46
 */
public class Test {
    public static void main(String[] args) {

        RobotSemanticInitReq robotSemanticInitReq = RobotSemanticInitReq.builder().userInfo(RobotUserInfo.builder().userName("123").locationName("北京市").build()).build();
        System.out.println(JSONObject.toJSONString(robotSemanticInitReq));

        AppParam appParam = AppParam.builder().param(robotSemanticInitReq).build();
        System.out.println(JSONObject.toJSONString(appParam));
    }
}
