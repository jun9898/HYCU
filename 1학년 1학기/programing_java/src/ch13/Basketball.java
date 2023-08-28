package ch13;

class Point {
    private int total = 0; // 임계영역 특성상 private으로 함
    synchronized void goalin(int point){ // 임계영역
        total = total + point;
    }
    int gettotal(){
        return total;
    }
}
class Player extends Thread{
    Point goal; // goal과 main에서 생성된 임계 영역 아직 연결 안됨
    Player (Point number){
        goal = number; // 임계영역과 연결됨
    }
    public void run(){
        try {
            for(int n=0; n<10;n++){
                int pt = (int)(Math.random()*10)%3+1; // 점수생성
                goal.goalin(pt); // 임계영역에 점수 전달
                System.out.println("선수("+getName()+") = "+pt+"점");

                int sleep_time = (int)(Math.random()*10); // 점수생성
                sleep(sleep_time); // 다른 쓰레드 실행을 위해 잠시 대기
                if (goal.gettotal() >=20) break;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Basketball {
    public static void main(String[] args) {
        Point score = new Point(); // 임계영역을 갖는 오브젝트 생성
        Player [] player = new Player[5]; // 배열을 선언함

        for(int n = 0; n < 5; n++){
            player[n] = new Player(score); // player 오브젝트 생성(임계영역 전달)
            player[n].start();
        }
        for (int n = 0; n < 5; n++) {
            try {
                player[n].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("총 득점은 : " + score.gettotal() + "점");
    }
}
