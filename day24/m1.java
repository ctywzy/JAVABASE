package day24;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class m1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        String ipddress = ip.getHostAddress();
        System.out.println(ipddress);
        //ip = InetAddress.getByAddress("10.60.46.207");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}
