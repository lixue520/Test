package org.lanqiao.client;

import java.io.IOException;
import java.net.Socket;

/**
 * @Author qin
 * @Data 23:06
 * @Version 1.0
 */
public class UploadClient {
    //编写客户端-->用于上传猫猫头.jpg
    public static void main(String[] args) {
        //创建socket对象
        try {
            Socket client = new Socket("127.0.1.1",8888);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
