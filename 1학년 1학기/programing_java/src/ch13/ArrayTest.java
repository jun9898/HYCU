package ch13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList<>();
        String a = "A", b = "B", c = "C", d = "X";

        alist.add(a); alist.add(b); alist.add(c);
        System.out.println(alist); // 출력시 []가 자동으로 출력됨

        alist.add(2,d);
        System.out.println(alist); // 파이썬의 insert의 개념과 비슷한 것 같다

        Collections.sort(alist); // Collections 클래스의 sort 메소드
        System.out.println(alist);
    }
}
