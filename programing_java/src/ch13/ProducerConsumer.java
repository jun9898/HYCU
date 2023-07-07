package ch13;
class Buffer {
    private int contents;
    private boolean available = false; // 데이터 유무 플래그

    public synchronized void put(int value){ // 임계영역
        while (available == true){
            System.out.println("창고가 찼음. 생산자 : 대기");
            try{
                wait(); // 다른 쓰레드에서 notify()를 실행해 줄 때까지 대기
            }
            catch(InterruptedException e){}
        }
        contents = value;
        available = true; // 창고에 데이터 있음을 알림
        System.out.println("생산자 : 생산 "+contents);
        notify(); // 대기 상태의 쓰레드에게 신호를 보냄
    }
    public synchronized int get(){ // 임계영역
        while (available == false){
            System.out.println("창고가 비었음. 소비자 : 대기");
            try{
                wait(); // 다른 쓰레드에서 notify()를 실행해 줄 때까지 대기
            }
            catch(InterruptedException e){}
        }
        System.out.println("소비자 : 소비 "+contents);
        available = false; // 창고에 데이터 있음을 알림
        notifyAll(); // 대기 상태의 쓰레드에게 신호를 보냄
        return contents;
    }
}
class Producer extends Thread {
    private Buffer b;
    public Producer(Buffer blank){ // 생성자
        b = blank; // 임계영역과 연결됨
    }
    public void run(){
        for (int i = 1; i <= 10; i++) {
            b.put(i);
        }
    }
}
class Consumer extends Thread {
    private Buffer b;
    public Consumer(Buffer blank){ // 생성자
        b = blank; // 임계영역과 연결됨
    }
    public void run(){
        int value = 0;
        for (int i = 1; i <= 5; i++) {
            value = b.get();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buff = new Buffer(); // 임계영역 갖는 오브젝트 생성
        Producer pro = new Producer(buff); // 오브젝트 생성(임계영역 전달)
        Consumer con = new Consumer(buff); // 오브젝트 생성(임계영역 전달)
        Consumer con1 = new Consumer(buff); // 오브젝트 생성(임계영역 전달)

        pro.start();
        con.start();
        con1.start();
    }
}
