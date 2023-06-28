package ch05;

public class shift {
    public static void main(String[] args) {
//        int a = 178, b, N=4;
//        b = a<<N;
//
//        System.out.printf("10진수:  %04d << %d = %04d \n",a,N,b);
//        System.out.printf("16진수:0x%04d << %d = 0x%04X \n",a,N,b);
//        System.out.println("2진수:  "+Integer.toBinaryString(a)+"<<"+N);
//        System.out.println(" = "+Integer.toBinaryString(b));

//        int a = 178, b, N=2;
//        b = a>>>N;
//
//        System.out.printf("10진수:  %04d >>> %d = %04d \n",a,N,b);
//        System.out.printf("16진수:0x%04d >>> %d = 0x%04X \n",a,N,b);
//        System.out.println("2진수:  "+Integer.toBinaryString(a)+">>>" + N);
//        System.out.println(" = "+Integer.toBinaryString(b));

//        byte a = 100, b, N = 2;
//
//        b = (byte)((int) a >> N);
//        // int형으로 형변환을 하며 4byte가 할당되었기 때문에 최상위 비트가 0으로 채워진다.
//
//        System.out.printf("10진수:  %d >> %d = %d \n",a,N,b);
//        System.out.printf("16진수:0x%X >> %d = 0x%X \n",a,N,b);
//        // 최상위 비트가 0으로 채워져서 답은 11011이다.
//        System.out.println("2진수:  "+Integer.toBinaryString(a)+">>" + N);
//        System.out.println("   =   "+Integer.toBinaryString(b));

        byte a = -100, b, N = 2;
        int bitmask = 0x000000FF;
        int ta, tb;

        b = (byte)((int) a >> N);

        System.out.printf("10진수:  %d >> %d = %d \n",a,N,b);
        System.out.printf("16진수:  0x%X >> %d = 0x%X \n",a,N,b);
        System.out.println("2진수:  "+Integer.toBinaryString(a)+">>" + N);
        System.out.println("   = "+Integer.toBinaryString(b));

        ta = a & bitmask; //출력을 위해 하위 1바이트 추출
        tb = b & bitmask; //출력을 위해 하위 1바이트 추출
        System.out.println("하위 1바이트 2진수:               "+Integer.toBinaryString(ta)+">>"+N);
        System.out.println("                           = "+Integer.toBinaryString(tb));
    }
}
