import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @创建人 zh
 * @创建时间 2020 5 13
 * @描述 ping host主机
 */
public class Ping {
    public static void main(String[] args) throws IOException {
        String host = "www.baidu.com";
        int timeOut = 3000; //超时应该在3秒以上
        boolean status = InetAddress.getByName(host).isReachable(timeOut);
        System.out.println(status);
    }
}
