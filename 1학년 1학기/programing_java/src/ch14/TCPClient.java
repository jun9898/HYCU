package ch14;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws  Exception{
        String server = args[0];
        int port = Integer.parseInt(args[1]);
        Socket csocket = new Socket(server, port); // 클리이언트 소켓 생성(서버에 연결요청)
        InputStream istream = csocket.getInputStream(); // 소켓입력 스트림 생성
        DataInputStream distream = new DataInputStream(istream);

        for (int i = 1; i <= 5; i++) {
            int imsg = distream.readInt();
            System.out.println("data to server : "+imsg);
        }
        csocket.close();
    }
}
