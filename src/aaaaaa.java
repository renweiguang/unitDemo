import com.alibaba.fastjson.JSONObject;

/**
 * @author rwg
 * @date 2021/10/15 16:59
 */
public class aaaaaa {
    public static void main(String[] args) {
        String a = "{sig=QmsBM703eF6FUCBi+1EVNykLWSRvpeEqqov97KxCLAri7isEePEGrrHuw7+UroD+XeibRSPou\n" +
                "z5hYkNmhLpniiUk/KwOarQPTxSj1eE3ClISl7QolceSPVf9zXw0qUZmD4Yx2ygS26sB6GxxBCTgnrY\n" +
                "X3slmMqDAQtG3pU3LJXE=, pageNo=1, pageSize=10,\n" +
                "platformCode=BLLC9M3Q2, seq=1559817133443, timestamp=1559817133443}";
        System.out.println(JSONObject.toJSONString(a));
    }
}
