package ch04;

public class ConditionOp1 {
    public static void main(String[] args) {
//        String right = "맞음", wrong = "틀림";
//        boolean value;
//
//        // true 일때는 왼쪽이 answer에 할당된다.
//        value = true;
//        String answer = value ? right : wrong;
//        System.out.println(answer);
//
//        // false 일때는 오른쪽이 answer에 할당된다.
//        value = false;
//        answer = value ? right : wrong;
//        System.out.println(answer);

        int x, abs_x;

        x = -10;
        abs_x = x<0 ? -x:x;
        System.out.println("abs("+x+")=" +abs_x);

        x = 10;
        abs_x = x<0 ? -x:x;
        System.out.println("abs("+x+")=" +abs_x);
    }
}
