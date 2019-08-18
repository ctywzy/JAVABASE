package day24;

import java.io.IOException;
import java.net.*;

public class m2 {
    public static void main(String[] args) throws IOException {
        System.out.println("发送udp数据包");
        /*
        建立udp socket服务
         */
        DatagramSocket ds = new DatagramSocket();
        System.out.println(ds.getLocalPort());
        String str = "udp socket通讯";
        byte[] buf = str.getBytes();
        /*
        封装udp包
         */
        DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("10.60.46.207"),9999);
        /*
        发送包
         */
        ds.send(dp);
        /*
        关闭服务
         */
        ds.close();
    }
}
