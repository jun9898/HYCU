package ch07;
class BookTest {
    String title;
    String janre;
    void printBook() {
        System.out.println("제 목: "+title);
        System.out.println("장 르: "+janre);
    }
}
class Novel extends BookTest {
    String writer;
    void printNov() {
        printBook();
        System.out.println("저 자: "+writer);
    }
}
class Magazine extends BookTest {
    int day;
    void printMag(){
        printBook();
        System.out.println("발매일: " + day + "일");
    }
}

public class BookShelf {
    public static void main(String[] args) {
        Novel nov = new Novel();
        Magazine mag = new Magazine();

        nov.title = "구운몽";
        nov.janre = "고전문학";
        nov.writer = "김만중";
        nov.printNov();

        System.out.println("---------------");

        mag.title = "씨네21";
        mag.janre = "영화잡지";
        mag.day = 20;
        mag.printMag();
    }
}
