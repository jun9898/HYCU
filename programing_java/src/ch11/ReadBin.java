package ch11;
import java.io.*;
public class ReadBin {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream(args[0]); //파일열기
            int c;
            String s = new String();
            while((c=in.read()) != -1) // 파일로부터 한 문자 읽은 후 정수(4Byte)로 저장
                s = s+(char)c; // 정수값을 2바이트 char 변환 후 s에 추가
            System.out.print(s); // ASCII 코드 문자가 아닌경우 문자가 망가짐
            in.close(); // 파일 닫기
        }
        catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (Exception e) {
            System.out.println("파일을 지정하지 않았습니다.");
        }
    }
}
