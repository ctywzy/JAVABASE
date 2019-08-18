package day24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class m5 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9999);

        byte[] buf = new byte[BUFFER_SIZE];

        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        while(true){
            ds.receive(dp);
            String text = new String(dp.getData(),0,dp.getLength());
            if("over".equals(text)){
                break;
            }
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            System.out.println(ip+ " : " +port + " : " + text);
        }
        ds.close();
    }
}
