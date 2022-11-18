package dingshirenwu;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("系统正在运行……");
            }
        }, 5000, 2000);
        /* 当启动定时器后，5s之后开始每隔2s执行一次定时器任务 */
    }
}
