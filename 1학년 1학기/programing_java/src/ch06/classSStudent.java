package ch06;

public class classSStudent {
    public static void main(String[] args) {

        Student kim = new Student(), lee = new Student();

        kim.name = "가나";
        lee.name = new String("다라");

        System.out.print(kim.name);
        for (int t : kim.point)
            System.out.print(" " + t);

    }
}
