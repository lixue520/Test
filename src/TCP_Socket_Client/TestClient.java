package TCP_Socket_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Author qin
 * @Data 21:46
 * @Version 1.0
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        //通过IP地址和端口号，创建一个Socket对象
        Socket s = new Socket("127.0.0.1",8888);
        //建立输入数据流
        //DataOutputStream dis = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println(dis.readUTF());
        System.out.println("本地端口："+s.getInetAddress()+" 本地IP"+s.getLocalPort());

        //关闭数据流
        dis.close();
        //关闭 Socket 对象
        s.close();
    }
}
