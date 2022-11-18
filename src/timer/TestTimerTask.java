package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimerTask {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }, 4000, 1000);

    }
}
