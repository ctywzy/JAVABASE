package day24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class m3 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException{
        System.out.println("接收udp传输数据包");
        int Port = 9999;
        DatagramSocket ds = new DatagramSocket(Port);
        System.out.println(ds.getLocalPort());

        byte[] buf = new byte[BUFFER_SIZE];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);

        ds.receive(dp);

        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        String text = new String(dp.getData(),0,dp.getLength());
        System.out.println(ip + ":" + port +":" +text);
        ds.close();
    }
}
