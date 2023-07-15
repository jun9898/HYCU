package PlayData.ch14;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"Database");
        list.add("iBatis");

        int size = list.size();
        System.out.println(size);
        System.out.println();

        String skill = list.get(2);
        System.out.println(skill);
        System.out.println();

        for (int i = 0 ; i < list.size(); i++){
            String str = list.get(i);
            System.out.print(i + " : " + str + ", ");
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBatis");

        for (String value : list){
            System.out.print(value + ", ");

        }

    }
}
