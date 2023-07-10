package ch03;// 입력 키보드 input

public class ScannerTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

//        // string 과 int 형을 할당
//        String name ;
//        int age ;
//
//        System.out.println("이름과 나이를 입력하세요.");
//
//        // 여기서 next 메소드를 사용했기 때문에 '홍 길동' 이와같은 입력은 불가능하다
//        // 다음과 같은 입력을 하고싶다면 next 가 아닌 nextLine 메소드를 사용해야 한다.
//        name = input.next();
//        // int 형에 입력값을 넣어 줄 것임으로 nextInt 메소드를 사용해야 한다.
//        // 여기서 nextInt는 스트림 버퍼를 비우지 않아 숫자를 입력 한 뒤
//        // spacebar 로 공백을 만들어놓으면 그 공백을 데이터로 읽어들인다.
//        age = input.nextInt();
//
//        System.out.println(name + "은 멋진 이름입니다.");
//        System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");

        // string 과 int 형을 할당
        String name ;
        int age ;

        System.out.println("이름과 나이를 입력하세요.");

        age = input.nextInt();
        input.nextLine(); // int 입력이 끝난 다음 입력 스트림 버퍼를 비우기 위해 추가한 메소드
        name = input.nextLine();

        System.out.println(name + "은 멋진 이름입니다.");
        System.out.println(age + "세는 자바를 공부하기 좋은 나이입니다.");
    }
}
