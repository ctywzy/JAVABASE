package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
多线程实现聊天系统
有弊端，局域网中所有数据都发送给这个ip，其他人只能发不能收
可以直接广播，发送到所有机器上
XXXX.XXXX.XXXX.255
最后一位是255就是广播
 */
class Send implements Runnable{

    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = null;

            while((line = br.readLine())!=null){
                byte[] buf = new byte[1024];
                buf = line.getBytes("utf-8");
                DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("127.0.0.1"),9999);
                ds.send(dp);
                if("over".equals(line)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }
    }
}

class Receiver implements  Runnable{

    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,buf.length);
            while(true){

                ds.receive(dp);
                String ip = dp.getAddress().getHostAddress();
                String text = new String(dp.getData(),0,dp.getLength());
                if("over".equals(text)){
                    break;
                }
                System.out.println(ip+" : "+text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ds.close();
        }
    }
}
public class m6 {
    public static void main(String[] args) {
        Send s = new Send();
        Receiver r = new Receiver();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
