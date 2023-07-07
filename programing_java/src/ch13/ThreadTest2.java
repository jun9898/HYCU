package ch13;

public class ThreadTest2 implements Runnable {
    private String word;
    private int time;
    private int count;
    public ThreadTest2(String w, int t, int c){ // 생성자
        word = w;
        time = t;
        count = c;
    }
    public void run(){
        for (int n = 0; n < count; n++) {
            System.out.println(word);
            try{
                Thread.sleep(time); // time 밀리초 만큼 현재 쓰레드 대기
            }
            catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest tick = new ThreadTest("tick",1000,3); // 출력 예상 틱텍틱텍틱
        ThreadTest tack = new ThreadTest("tack",1300,3);
        ThreadTest tock = new ThreadTest("tock",1500,3);

        tick.start();
        tack.start();
        tock.start();
    }
}
