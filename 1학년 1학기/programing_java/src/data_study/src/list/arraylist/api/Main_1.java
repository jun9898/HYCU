package list.arraylist.api;

import java.sql.SQLOutput;

public class Main_1 {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        ArrayList.ListIterator li = numbers.listIterator();
        while(li.hasNext()){
            int number = (int)li.next();
            if(number == 30){
                li.add(35);
                // gitTest
            }
        }
        System.out.println(numbers);
    }
}
