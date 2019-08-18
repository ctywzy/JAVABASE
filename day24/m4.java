package day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class m4 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket ds = new DatagramSocket();

        String line = null;
        while((line = br.readLine()) != null){
            DatagramPacket dp = new DatagramPacket(line.getBytes(),line.length(), InetAddress.getByName("127.0.0.1"),9999);
            ds.send(dp);
            if("over".equals(line)){
                break;
            }
        }
        ds.close();
    }
}
