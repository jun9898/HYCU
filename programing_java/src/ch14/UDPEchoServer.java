package ch14;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UDPEchoServer {
    public static void main(String[] args) throws Exception {
        int srvPort = 1234;
        int clntPort = 4321;
        String sbye = "";

        // 서버용 데이터그램 소켓 오브젝트 생성
        DatagramSocket dgSocket = new DatagramSocket(srvPort);

        System.out.println(" Server running...");

        do {
            // 수신 패킷 오브젝트 생성
            DatagramPacket dgPacket = new DatagramPacket(new byte[100], 100);

            // 패킷 수신
            dgSocket.receive(dgPacket);
            String msg = new String(dgPacket.getData(), 0, dgPacket.getLength());
            msg = msg.stripTrailing(); // 문자열 뒤의 공백 삭제
            System.out.printf("incoming message : %s message size : %d\n",msg,msg.length());

            // 송신 패킷 오브젝트 생성
            dgPacket = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8),msg.getBytes().length, dgPacket.getAddress(),clntPort);

            // 패킷 송신
            dgSocket.send(dgPacket);

            sbye = msg; // 임시
        } while (!sbye.endsWith("bye")); // bye 입력시 종료
        dgSocket.close();
    }
}
