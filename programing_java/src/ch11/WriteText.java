package ch11;
import java.io.*;
public class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter(args[0]);

            out.write("0123\n");;
            out.write("ABCD\n");;
            out.write("가나다라\n");;
            out.close(); //파일닫기
        }
        catch (Exception e){
            System.out.println("파일을 지정하지 않았습니다.");
        }
    }
}
