package ch14;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLConnectionTest {
    public static void main(String[] args) throws Exception {
        URL w3c = new URL("https://www.w3.org/");
        URLConnection w3cCon = w3c.openConnection();

        System.out.println("문서의 타입 : " + w3cCon.getContentType());
        System.out.println("최종 수정일자 : " + new Date(w3cCon.getLastModified()));

        System.out.println("문서 내용 : ");
        InputStream input = w3cCon.getInputStream();

        int i = 500; // 최대 500문자까지만 읽음
        int c;
        while (((c = input.read()) != -1) && (--i > 0)) {
            System.out.print((char) c);
        }
        input.close();
    }
}
