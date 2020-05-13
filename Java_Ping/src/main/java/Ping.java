import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @创建人
 * @创建时间
 * @描述
 */
public class Ping {
    public static void main(String[] args) throws IOException {
        String host = "www.baidu.com";
        int timeOut = 3000; //超时应该在3秒以上
        boolean status = InetAddress.getByName(host).isReachable(timeOut);
        System.out.println(status);
    }
}
