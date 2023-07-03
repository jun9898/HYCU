package ch10;
class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class ThisAB {
    public static void main(String[] args) {
        Person man = new Person("ABC",123);

        System.out.println("Name : " + man.name);
        System.out.println("Age : " + man.age);
    }
}
