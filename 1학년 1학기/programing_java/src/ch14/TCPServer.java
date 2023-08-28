package ch14;
// 사용예 : java TCPServer 포트번호

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        int port = Integer.parseInt(args[0]);
        ServerSocket ssocket = new ServerSocket(port); // 서버소켓 생성

        System.out.println("server is running...");
        while(true){
            Socket csocket = ssocket.accept(); // 연결수락, 클라이언트 소켓 생성
            OutputStream ostream = csocket.getOutputStream(); // 소켓 출력 스트림 생성
            DataOutputStream dostream = new DataOutputStream(ostream); // 스트림 변환

            for (int imsg = 1 ; imsg <= 5 ; imsg++) // 숫자 1~5를 5회에 걸쳐 송신
                dostream.writeInt(imsg);
            csocket.close();
        }
    }
}
