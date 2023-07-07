package ch13;
class A extends Thread {
    public void run() {
        System.out.println("Daemon Thread A 시작");
        try {
            Thread.sleep(700);
        }
        catch (Exception e) {
        }
        System.out.println("Daemon Thread A 끝");
    }
}
class B extends Thread {
    public void run() {
        System.out.println("독립 Thread B 시작");
        try {
            Thread.sleep(5000);
        }
        catch (Exception e) {
        }
        System.out.println("독립 Thread B 끝");
    }
}
public class DaemonThreadTest {
    public static void main(String[] args) {
        System.out.println("main Thread 시작");

        A threadA = new A();
        B threadB = new B();

        threadA.setDaemon(true);
        threadB.setDaemon(false);

        threadA.start();
        threadB.start();

        try{
            Thread.sleep(500);
        }
        catch (Exception e){
        }
        System.out.println("main Thread 끝");
    }
}
