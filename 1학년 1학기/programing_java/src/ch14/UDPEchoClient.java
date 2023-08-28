package ch14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPEchoClient {
    public static void main(String[] args) throws IOException {
        int srvPort = 1234;
        int clntPort = 4321;
        String sbye = "";
        Scanner cin = new Scanner(System.in);

        // 클라이언트용 데이터그램 소켓 오브젝트 생성
        DatagramSocket dgSocket = new DatagramSocket(clntPort);
        InetAddress remote_addr = InetAddress.getByName("127.0.0.1");

        do {
            System.out.print("message to be sent : ");
            String msg = cin.nextLine().stripTrailing(); // 문자열 뒤의 공백 삭제
            if(msg.length() == 0) continue;

            // 송신 패킷 오브젝트 생성
            DatagramPacket dgPacket = new DatagramPacket(msg.getBytes(), msg.getBytes().length, remote_addr, srvPort);
            System.out.println("send message size : " + dgPacket.getData().length);

            // 패킷 송신
            dgSocket.send(dgPacket);

            // 수신 패킷 오브젝트 생성 : 최대 65507바이트
            dgPacket = new DatagramPacket(new byte[100], 100);

            // 패킷 수신
            dgSocket.receive(dgPacket);
            msg = new String(dgPacket.getData(), 0, dgPacket.getLength());
            msg = msg.stripTrailing(); // 문자열 뒤의 공백 삭제
            System.out.printf("\nincoming message : %s message size : %d\n", msg, msg.length());

            sbye = msg;

        } while (!sbye.endsWith("bye")); // bye 입력시 종료
        dgSocket.close();
    }
}
