package ch12;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer a = new StringTokenizer("Test tokenizer test", " ");
        while (a.hasMoreTokens()) {
            String token = a.nextToken();
            System.out.println(token);
        }
    }
}
