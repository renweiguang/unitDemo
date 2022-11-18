package excelPOI;

import java.math.BigDecimal;

/**
 * @author renwg
 * @date 2022/2/17
 */
public class demo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("123.456777753413321231");
        String result = b1.toString();
        System.out.println("result = "+result);
    }
}
