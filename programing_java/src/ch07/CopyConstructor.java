package ch07;
class Book {
    String title;
    String writer;

    Book(String t, String w){
        title = t;
        writer = w;
    }

    Book(Book copy){
        title = copy.title;
        writer = copy.writer;
        System.out.println("복제 생성자 실행");
    }

    void print() {
        System.out.println("제 목: " + title);
        System.out.println("저 자: " + writer);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Book book1 = new Book("한강", "조정해");
        System.out.println("---book1--- ");
        book1.print();

        Book book2 = new Book(book1);
        System.out.println("---book2--- ");
        book2.print();

        book2.title = "정글만리";
        System.out.println("---book2--- ");
        book2.print();
    }
}
