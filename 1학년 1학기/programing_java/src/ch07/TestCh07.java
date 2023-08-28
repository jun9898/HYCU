package ch07;

class Study {
    String name;
    String teacher;
    void printmsg(){
        System.out.println("name : " + name + " teacher : " + teacher);
    }
}

class SubJava extends Study{
    int credit;
    String room;
    void printJV(){
        printmsg();
        System.out.println("credit : "+credit+" room : "+room);
    }
}
public class TestCh07 {
    public static void main(String[] args) {
        SubJava sj = new SubJava();
        sj.name = "자바";
        sj.credit = 3;
        sj.room = "R123";
        sj.teacher = "한사대";
        sj.printJV();
    }
}
