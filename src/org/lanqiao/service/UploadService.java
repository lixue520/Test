package org.lanqiao.service;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Author qin
 * @Data 23:06
 * @Version 1.0
 */
public class UploadService {
    public static void main(String[] args) {
        //创建客户端-->接收上传的图片
        try {
            ServerSocket sever = new ServerSocket(10203);
            //接收文件用到的是什么流？


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
