package abstractDemo;

import java.math.BigDecimal;

/**
 * @author renwg
 * @date 2022/3/2
 */
public class lasldlas {
    public static void main(String[] args) {
        //若是String类型，也可以先转为BigDecimal
        BigDecimal value = new BigDecimal("51451.00");
        //去除多余0
        BigDecimal noZeros = value.stripTrailingZeros();
        //BigDecimal => String
        String result = noZeros.toPlainString();
        System.out.println("result: " + result);
    }
}
