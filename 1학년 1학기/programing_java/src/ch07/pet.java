package ch07;

class Animal {
    String name ;
    int age ;
    Animal() {
        System.out.println("슈퍼 클래스 Animal 생성자");
    }
}

class Cat extends Animal {
    int birth ;
    Cat() {
        System.out.println("서브 클래스 Cat 생성자");
    }
}

public class pet {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println("오브젝트 cat 생성");
    }
}
