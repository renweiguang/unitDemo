//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class AliyunApi {
//    //认证应用信息
//    private static String appId;
//
//    //权限系统信息
//    private static String psId;
//
//
//    /*零信任体系的url信息*/
//    private static String accountDetailUrl = "/api/bff/v1.2/auth/ud/account/detail";
//    private static String tokenExchangeUrl = "/api/bff/v1.2/auth/token/exchange";
//    private static String oauthTokenUrl = "/api/public/bff/v1.2/ps/oauth/token";
//    private static String userRolePermissionUrl = "/api/bff/v1.2/developer/ps/token_user_role_permissions";
//    private static String organizationRootUrl = "/api/bff/v1.2/developer/isv/organization/root";
//    private static String organizationChildrenUrl = "/api/bff/v1.2/developer/isv/organization/children";
//    private static String organizationDetailUrl = "/api/bff/v1.2/developer/isv/organization/detail";
//    private static String accountListUrl = "/api/bff/v1.2/developer/isv/ud/account/list";
//    private static String accessTokenCheck = "/api/public/bff/v1.2/oauth/access_token/valid";
//    private static String logoutUrl = "/api/public/bff/v1.2/sp/slo/";
//
//
//    /**
//     * 获取用户详情
//     *
//     * @param originalAccessToken 原本的应用访问令牌
//     * @return 返回用户详情json
//     */
//    static JSONObject getAccountDetail(String originalAccessToken) {
//        Map<String, String> map = new HashMap<>();
//        map.put("access_token", originalAccessToken);
//        String result = HttpClientUtil.doGet(SsoConfig.aliyunUrl + accountDetailUrl, map);
//        return getData(result);
//    }
//
//    /**
//     * 换取应用令牌
//     * 向阿里求证，此接口暂未启用
//     *
//     * @param originalAccessToken 原访问令牌
//     * @param appId               申请到的应用ID
//     */
//    @Deprecated
//    public static JSONObject getExchangeAppToken(String originalAccessToken, String appId) {
//        JSONObject param = new JSONObject();
//        param.put("access_token", originalAccessToken);
//        param.put("app_id", appId);
//
//        String result = HttpClientUtil.doPostJson(SsoConfig.aliyunUrl + tokenExchangeUrl, param.toJSONString());
//        //        String result = OkHttpClientUtil.doPostJSON(BASE_URL + tokenExchangeUrl, param);
//        return getData(result);
//    }
//
//    /**
//     * 获取应用的 access_token
//     *
//     * @return
//     */
//    public static String getAppAccessToken() {
//        return getAccessToken(SsoConfig.aliyunAppkey, SsoConfig.aliyunAppsecret);
//    }
//
//    /**
//     * 获取权限的 access_token
//     * 权限系统的接口都要传此接口返回的 access_token
//     *
//     * @return
//     */
//    public static String getOauthAccessToken() {
//        return getAccessToken(SsoConfig.aliyunAppkey, SsoConfig.aliyunAppsecret);
//    }
//
//    /**
//     * @param key
//     * @param secret
//     * @return access_token
//     */
//    private static String getAccessToken(String key, String secret) {
//        JSONObject param = new JSONObject();
//        param.put("appKey", key);
//        param.put("appSecret", secret);
//        String result = HttpClientUtil.doPostJson(SsoConfig.aliyunUrl + oauthTokenUrl, param.toJSONString());
//        //        String result = OkHttpClientUtil.doPostJSON(BASE_URL + oauthTokenUrl, param);
//        JSONObject jo = getData(result);
//        return jo.getString("access_token");
//    }
//
//    /**
//     * 获取用户的角色和权限信息
//     *
//     * @param oauthAccessToken
//     * @param appToken
//     * @return
//     */
//    public static JSONObject getUserRolePermission(String oauthAccessToken, String appToken) {
//        JSONObject param = new JSONObject();
//        param.put("access_token", oauthAccessToken);
//        param.put("app_token", appToken);
//        String result = HttpClientUtil.doPostJson(SsoConfig.aliyunUrl + userRolePermissionUrl + "?access_token=" + oauthAccessToken, param.toJSONString());
//        //        String result = OkHttpClientUtil.doPostJSON(BASE_URL + userRolePermissionUrl + "?access_token=" + oauthAccessToken, param);
//        System.out.println(result);
//        return getData(result);
//    }
//
//    /**
//     * 获取根节点单位
//     *
//     * @param appAccessToken
//     * @return
//     */
//    public static JSONObject getOrganizationRoot(String appAccessToken) {
//        Map<String, String> map = new HashMap<>();
//        map.put("access_token", appAccessToken);
//        String result = HttpClientUtil.doGet(SsoConfig.aliyunUrl + organizationRootUrl, map);
//        //        String result = OkHttpClientUtil.doGet(BASE_URL + organizationRootUrl, map);
//        System.out.println(result);
//        return getData(result);
//    }
//
//    /**
//     * 获取指定单位的直属子单位
//     *
//     * @param appAccessToken
//     * @return
//     */
//    public static JSONObject getOrganizationChildren(String appAccessToken, String externalId) {
//        Map<String, String> map = new HashMap<>();
//        map.put("access_token", appAccessToken);
//        map.put("externalId", externalId);
//        String result = HttpClientUtil.doGet(SsoConfig.aliyunUrl + organizationChildrenUrl, map);
//        //        String result = OkHttpClientUtil.doGet(BASE_URL + organizationChildrenUrl, map);
//        System.out.println(result);
//        return getData(result);
//    }
//
//    /**
//     * 获取单位详情
//     *
//     * @param appAccessToken
//     * @param externalId
//     * @return
//     */
//    public static JSONObject getOrganizationDetail(String appAccessToken, String externalId) {
//        Map<String, String> map = new HashMap<>();
//        map.put("access_token", appAccessToken);
//        map.put("externalId", externalId);
//        String result = HttpClientUtil.doGet(SsoConfig.aliyunUrl + organizationDetailUrl, map);
//        //        String result = OkHttpClientUtil.doGet(BASE_URL + organizationDetailUrl, map);
//        System.out.println(result);
//        return getData(result);
//    }
//
//    /**
//     * 获取单位下的用户，直接
//     *
//     * @param appAccessToken
//     * @param externalId
//     * @return
//     */
//    public static JSONArray getAccountList(String appAccessToken, String externalId) {
//        int pageSize = 20;
//        Map<String, String> map = new HashMap<>();
//        map.put("access_token", appAccessToken);
//        map.put("ouExternalId", externalId);
//        map.put("pageSize", pageSize + "");
//        map.put("currentPage", "1");
//        JSONArray ja = new JSONArray();
//        while (true) {
//            String result = HttpClientUtil.doGet(SsoConfig.aliyunUrl + accountListUrl, map);
//            //            String result = OkHttpClientUtil.doGet(BASE_URL + accountListUrl, map);
//            System.out.println(result);
//            JSONObject jo = getData(result);
//            if (null == jo) {
//                break;
//            }
//            JSONArray list = jo.getJSONArray("list");
//            ja.addAll(list);
//            if (list.size() < pageSize) {
//                break;
//            }
//        }
//        return ja;
//    }
//
//
//    /**
//     * 加工处理零信任返回的json信息
//     *
//     * @param result 零信任获取的json整体信息
//     * @return 有用的数据信息
//     */
//    private static JSONObject getData(String result) {
//        if (null == result) {
//            return null;
//        }
//        JSONObject jsonObject = JSON.parseObject(result);
//        if (null == jsonObject || !"200".equals(jsonObject.getString("code"))) {
//            return null;
//        }
//        JSONObject data = jsonObject.getJSONObject("data");
//        if (null == data) {
//            return null;
//        }
//        return data;
//    }
//
//
//    /**
//     * 判断访问access是有效
//     *
//     * @param accessToken 访问的access_token
//     * @return 是否有效
//     */
//    public static boolean accessTokenCheck(String accessToken) {
//        boolean result;
//        JSONObject param = new JSONObject();
//        param.put("access_token", accessToken);
//        String resultString = HttpClientUtil.doPostJson(SsoConfig.aliyunUrl + accessTokenCheck, param.toJSONString());
//        if (StringUtils.isEmpty(resultString)) {
//            return false;
//        }
//        JSONObject resultJSON = JSON.parseObject(resultString);
//        if (resultJSON == null) {
//            result = false;
//        } else {
//            result = resultJSON.getBoolean("success");
//        }
//        return result;
//    }
//
//    /**
//     * 退出登录
//     * @param accessToken
//     * @param appId
//     * @return
//     */
//    public static boolean logout(String accessToken, String appId) {
//        logoutUrl += appId + "?access_token=" + accessToken;
//        HttpClientUtil.doGet(logoutUrl);
//        return true;
//    }
//
//}
