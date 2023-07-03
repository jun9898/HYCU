package ch10;

class ATest {
    int m = -10;
    void p(){
        System.out.println("슈퍼클래스 p()");
    }
}
class BTest extends ATest {
    int n = 20;
    @Override
    void p() {
        System.out.println("서브클래스 p()");
    }
    void q(){
        System.out.println("서브클래스 q()");
    }
}
public class polymorphismTest {
    public static void main(String[] args) {
        ATest oa = new ATest();
        BTest ob = new BTest();

        System.out.println("oa.m = " + oa.m);
        oa.p(); //슈퍼클래스의 p()가 호출됨

        ob.m = 10; //슈퍼클래스로 부터 상속받은 필드 m
        oa = ob; //서브 클래스의 오브젝트를 슈퍼 클래스의 오브젝트에 대입
            //슈퍼 클래스의 오브젝트는 사라짐
        System.out.println("oa.m = "+oa.m); //oa의 m값이 ob의 m값으로 변경된다.
        System.out.println("ob.m = "+ob.m);

        oa.p();  //서브클래스의 p()가 호출됨

    }
}
