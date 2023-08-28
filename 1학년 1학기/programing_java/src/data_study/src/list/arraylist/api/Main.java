package list.arraylist.api;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Integer 형식의 ArrayList를 만든다.

        numbers.add(10); // 배열 끝에 내가 원하는 값을 추가하는 방법
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("add 값");
        System.out.println(numbers); // 결과값으로 [10,20,30,40] 출력

        numbers.add(1,50); //내가 원하는 인덱스에 해당 엘리먼트를 더해주고 뒤에 위치한 엘리먼트를 한 칸씩 미룬다.
        System.out.println("\nadd (인덱스, 값)");
        System.out.println(numbers); // 결과값으로 [10,50,20,30,40] 출력

        numbers.remove(2); // 해당 인덱스에 위치한 엘리먼트를 삭제하고 뒤에 위치한 엘리먼트들을 한 칸씩 당긴다.
        System.out.println("\nremove (인덱스)");
        System.out.println(numbers); // 결과값으로 [10, 50, 30, 40] 출력

        System.out.println("\nget (인덱스)");
        System.out.println(numbers.get(2)); // 해당 인덱스의 값을 가져온다. 결과값으로 40 출력

        Iterator<Integer> it = numbers.iterator(); //number 에 속해있는 값을 하나씩 순회하면서 탐색한다.
        while(it.hasNext()){                       //it 변수의 hasNext 가 True 일 경우 계속해서 반복한다.
            int value = it.next() ;                //it.next 메서드를 호출할 때마다 엘리먼트를 순서대로 리턴하여 value 변수에 할당한다.
            System.out.println(value);             //value 값을 출력.
        }

        for(int value : numbers){      // value 에 for 문이 반복될때마다 numbers 에 저장된 값들을 하나하나 꺼내서 할당할 수 있다.
            System.out.println(value); // for 문 형식으로 좀더 간결하게 코드를 짤수도 있다.
        }
    }
}
