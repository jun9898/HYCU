package ch14;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        int port = Integer.parseInt(args[0]);
        DatagramSocket ds = new DatagramSocket(port);
        String q;
        do {
            byte buffer[] = new byte[60];
            // 패킷 오브젝트 생성
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp); // 패킷 수신
            String msg = new String(dp.getData()); // 바이트 배열을 문자열로 변환
            System.out.println("수신 메시지 : " + msg );
            q = msg.substring(0, 3);
        } while (!q.equals("bye"));
        ds.close();
    }
}
