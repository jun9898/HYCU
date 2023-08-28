package ch12;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        Date now = new Date();
        Calendar cal = new GregorianCalendar();

        System.out.println(t);
        System.out.println(now);
        System.out.println(cal);
    }

}
