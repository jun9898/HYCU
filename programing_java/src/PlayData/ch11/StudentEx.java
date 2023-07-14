package PlayData.ch11;

public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("j","1234",1);
        System.out.println("student.name = " + student.name);
        System.out.println("student.ssn = " + student.ssn);
        System.out.println("student.studentNo = " + student.studentNo);
    }
}
