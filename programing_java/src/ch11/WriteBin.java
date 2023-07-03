package ch11;
import java.io.*;

public class WriteBin {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream(args[0]);
            byte x;

            for(x = 48; x<=57; x++)
                out.write(x);
            out.write('\n');
            for(x = 65; x<=90; x++)
                out.write(x);
            out.write('\n');

            out.close(); //파일닫기
        }
        catch (Exception e){
            System.out.println("파일을 지정하지 않았습니다.");
        }
    }
}
