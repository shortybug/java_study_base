import java.util.Timer;

/**
 * @创建人
 * @创建时间
 * @描述
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask("TimerTask 1");
        timer.schedule(myTimerTask,2000L,1000L);
    }
}
