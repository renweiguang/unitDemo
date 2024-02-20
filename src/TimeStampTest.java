import stream.People;
import thisTest.Person;
import ziDingYiTryCatch.ProductDto;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TimeStampTest
 * @Description TODO
 * @Author renwg
 * @Date 2023/8/1 18:08
 * @Version 1.0
 */
public class TimeStampTest {
    public static void main(String[] args) {

//        String a  = "CHARSET=UTF-8&DATA=U15WWBMLRKJFPP2ZPLKT+EDLLSHELJYMBSRPOTYLP/0ZJZC7LBZXCSQ4NJNK1RGOF+XY3NGQJMZIB9GM6INNKKIHUUWUNVGA7IBL7QZUP/I=&FORMATTYPE=JSON&SIGNTYPE=SHA-256&TIMESTAMP=1691481637857&VERSION=1.0&KEY=QUZTWFR2HIL5A1GG";
//
//        String b = "CHARSET=UTF-8&DATA=U15WWBMLRKJFPP2ZPLKT+EDLLSHELJYMBSRPOTYLP/0ZJZC7LBZXCSQ4NJNK1RGOF+XY3NGQJMZIB9GM6INNKKIHUUWUNVGA7IBL7QZUP/I=&FORMATTYPE=JSON&SIGNTYPE=SHA-256&TIMESTAMP=1691481637857&VERSION=1.0&KEY=QUZTWFR2HIL5A1GG";
//
//        System.out.println(a.equals(b));

//        double f = 6.23556;
//        /**
//         *使用精确小数BigDecimal
//         */
//            BigDecimal bg = new BigDecimal(f);
//            /**
//             * 参数：
//             newScale - 要返回的 BigDecimal 值的标度。
//             roundingMode - 要应用的舍入模式。
//             返回：
//             一个 BigDecimal，其标度为指定值，其非标度值可以通过此 BigDecimal 的非标度值乘以或除以十的适当次幂来确定。
//             */
//            double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
////            System.out.println(f1);
//        StringBuilder title = new StringBuilder("");
//        Double fob = 65.888888;
//        BigDecimal bg = new BigDecimal(fob.toString()).setScale(2, BigDecimal.ROUND_HALF_UP);
//
//        title.append("¥").append(bg.toString());
//        System.out.println(title);
//        title.append("dsadsa").append("dqdqdq");
//        System.out.println(title);
        ProductDto sPOJO = new ProductDto();
        sPOJO.setFob(65.8899);
        sPOJO.setShowName("999 维澳佳牌蛋白");
        sPOJO.setSpec("盒");

        StringBuilder title = new StringBuilder("");
        if (title.length() == 0) {
            //解决丢失精度问题
            if (Objects.nonNull(sPOJO.getFob())) {
                BigDecimal bg = new BigDecimal(sPOJO.getFob().toString()).setScale(2, BigDecimal.ROUND_HALF_UP);
                title.append("¥").append(bg.toString());
            } else {
                title.append("¥").append(sPOJO.getFob());
            }
        }


        String productSpec = Optional.ofNullable(sPOJO.getSpec()).orElse("");
        title.append(" ").append(sPOJO.getShowName()).append(productSpec);
        System.out.println(title.toString());

//
//        long startTimestamp = 1690884550L;
//
//        long endTimestamp = System.currentTimeMillis();
//
//        long minutes = TimeUnit.MILLISECONDS.toMinutes(endTimestamp - startTimestamp);
//
//        System.out.println("时间差为：" + minutes + "分钟");
//
//        People person = new People();
//        if(Objects.isNull(person)){
//            System.out.println(1);
//        }
    }
}