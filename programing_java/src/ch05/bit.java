package ch05;

public class bit {
    public static void main(String[] args) {

//        int a = 170, b = 245, r;
//
//        r = a&b; // 비트 and
//
//        System.out.printf("a=%d = %X = 1010 1010\n",a,a);
//        System.out.printf("b=%d = %X = 1111 0101\n",b,b);
//        System.out.printf("r=%d = %X = 1010 0000\n",r,r);
//
//        int a = 170, b = 245, r;
//
//        r = a|b; // 비트 or
//
//        System.out.printf("a=%d = %X = 1010 1010\n",a,a);
//        System.out.printf("b=%d = %X = 1111 0101\n",b,b);
//        System.out.printf("r=%d = %X = 1111 1111\n",r,r);
//
//        int a = 170, b = 245, r;
//
//        r = a^b; // 비트 xor
//
//        System.out.printf("a=%d = %X = 1010 1010\n",a,a);
//        System.out.printf("b=%d = %X = 1111 0101\n",b,b);
//        System.out.printf("r=%d = %X = 0101 1111\n",r,r);
//
        byte a = -86, r;

        System.out.printf(" a=%4d = 0x%X = 1010 1010\n",a,a);
        System.out.printf("~a=%4d = 0x%X = 0101 0101\n",~a,~a);

        // r = ~a ~a의 값은 int 형이므로 byte형의 r에 대입 못함.
        r = (byte)~a; // (byte) ~a 의 하위 바이트만 r에 저장
        System.out.printf(" r=%4d = 0x%X = 0101 0101\n",r,r);

    }
}
