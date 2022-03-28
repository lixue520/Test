package TCP_Socket_Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.ServerCloneException;

/**
 * @Author qin
 * @Data 21:34
 * @Version 1.0
 */
public class TestServer {
    /*
    * 服务器端*/
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=null;
        //创建一个服务器对象，并指定端口
        try {
            serverSocket = new ServerSocket(8888);

            //监听并接受到此套接字的连接
            while(true){
                Socket s = serverSocket.accept();
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("客户端IP："+s.getInetAddress().getHostAddress()+
                        "客户端端口号："+s.getPort());
                System.out.println("本地地址 "+serverSocket.getInetAddress()+" 本地端口 "+
                        serverSocket.getLocalPort());
                /*
                * 该服务器端程序的作用就是监听 8888 端口，当有发送到本机 8888 端口的 Socket 请求时，建立输出流，将通过 accept() 方法创建的
                *  Socket 对象的 IP 地址和端口号输出到客户端。
                * 编译运行程序，使服务器启动并处于监听状态。*/

                //关闭数据流对象
                dos.close();
                //关闭Socket对象
                s.close();
                //不出循环持续监听
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket!=null){
                //关闭服务端套接对象
                serverSocket.close();
            }
        }
    }
}
