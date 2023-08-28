package PlayData.ch09.finalTest;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("9999999999", "jun");
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "usa" 수정 불가능
    }
}
