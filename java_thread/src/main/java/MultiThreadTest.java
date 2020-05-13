import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class MultiThreadTest {
 
    public static void main(String[] args) throws Exception {
        List<Integer> idList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            idList.add(i);
        }
        int threadNum = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });
            executorService.submit(thread);
        }
        executorService.shutdown();
    }
}
