package PlayData.Type;

public class TypeTest {
    public static void main(String[] args) {
        String strVar1 = "abcd";
        String strVar2 = "abcd";

        if (strVar1 == strVar2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("str1 equals str2");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        if (strVar3 == strVar4) {
            System.out.println("str3 == str4");
        } else {
            System.out.println("str3 != str4");
        }
        if (strVar3.equals(strVar4)) {
            System.out.println("str3 equals str4");
        }
    }
}