package date;

import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author renwg
 * @date 2022/4/26
 */
public class Date1 {
    public static void main(String[] args) {
//        System.out.println(DateUtil.between(DateUtil.endOfDay(new java.util.Date()), new java.util.Date(), DateUnit.SECOND));
//        System.out.println(test("b"));
        System.out.println(stampToDate("1666699598000"));
    }


    /**
     * @Description test
     * @author renwg
     * @date 2022/4/26
     */
    public static String test(String a) {
        return "a";
    }



    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        System.out.println(DateUtil.parseDateTime("1666699598000"));

        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}