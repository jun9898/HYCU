package ch06;
class Student {
    int [] point = {90,95,100};
    String name = "임시";

    double ave(){
        return (100.0);
    }
}

public class Score {
    public static void main(String[] args) {

        Student kim = new Student();
        System.out.println("Student 클래스의 오브젝트 kim 생성 성공.");

        Student lee = new Student();
        System.out.println("Student 클래스의 오브젝트 lee 생성 성공.");
    }
}
