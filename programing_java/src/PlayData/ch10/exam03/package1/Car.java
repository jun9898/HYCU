package PlayData.ch10.exam03.package1;

public class Car {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0){
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }

    private int speed;
    private boolean stop;


}
