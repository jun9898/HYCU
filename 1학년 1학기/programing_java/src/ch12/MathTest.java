package ch12;

public class MathTest {
    public static void main(String[] args) {
        double deg = 30, rad;
        rad = Math.toRadians(deg);

        double s = Math.sin(rad);
        double c = Math.cos(rad);
        double t = Math.tan(rad);

        System.out.printf("오일러 수 e = %5.3f \n",Math.E);
        System.out.printf("pi = %5.3f \n",Math.PI);
        System.out.printf("각도: %5.2f 도 \n",deg);
        System.out.printf("라디안: %5.2f rad \n",rad);
        System.out.printf("sin(%5.2f) = %5.2f \n",rad,s);
        System.out.printf("cos(%5.2f) = %5.2f \n",rad,c);
        System.out.printf("tan(%5.2f) = %5.2f \n",rad,t);
    }
}
