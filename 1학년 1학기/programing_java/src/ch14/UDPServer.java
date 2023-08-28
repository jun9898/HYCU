package ch14;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getByName(args[0]);
        int port = Integer.parseInt(args[1]);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input sending message(bye = quit");
        String buf;

        do {
            buf = in.readLine(); // 키보드로부터 한줄 입력
            byte buffer[] = buf.getBytes(); // 바이트 배열로 변환
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port); // 패킷화
            ds.send(dp);
        } while (!buf.equals("bye"));
        ds.close();
    }
}
