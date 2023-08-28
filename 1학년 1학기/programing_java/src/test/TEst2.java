package test;

import PlayData.ch12.ex06.Ex;

class Exam {
    byte op(byte a, byte b) {return (byte) (a+b);}
    int op(int a, int b) {return a-b;}
    float op(float a, float b) {return a*b;}
    double op(double a, double b) {return a/b;}
}

public class TEst2 {
    public static void main(String[] args) {
        Exam o = new Exam();
        System.out.println(o.op(8,2.0));
    }
}
