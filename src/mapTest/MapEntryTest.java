package mapTest;

/**
 * @author renwg
 * @date 2022/4/20
 */
public class MapEntryTest {
    public static void main(String[] args) {
        String a= "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx69a3ac0f6e6adcbb&redirect_uri=https%3A%2F%2Fh5mp.yiche.com%2Fanswerer-recruit%2Findex%3FchannelId%3D14&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";
        String b= "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx69a3ac0f6e6adcbb&redirect_uri=https%3A%2F%2Fh5mp.yiche.com%2Fanswerer-recruit%2Findex%3FchannelId%3D14&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";
        System.out.println(a.equals(b));
    }
}
