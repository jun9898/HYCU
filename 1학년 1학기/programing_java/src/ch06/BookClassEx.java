package ch06;

class Book {
    String title;
    int price;
    int num;
    int sum() {
        return (price * num);
    }
}
public class BookClassEx {
    public static void main(String[] args) {


        Book ob = new Book();

        System.out.println("Book 클래스의 오브젝트 ob 생성 성공");

        System.out.println("ob.tile = "+ ob.title);
        System.out.println("ob.price = "+ ob.price);
        System.out.println("ob.num = "+ ob.num);


    }
}
