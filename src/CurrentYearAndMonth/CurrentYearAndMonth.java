package CurrentYearAndMonth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentYearAndMonth {
    public static void main(String[] args) {
        //时间戳
        long l = System.currentTimeMillis();
        //日期
        Date date = new Date(l);
        //指定格式的日期
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
    }
}
