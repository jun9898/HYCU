package PlayData.ch12.ex01;

public class HankookTire extends Tire {
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + " 한국 Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + " 한국 Tire 펑크 ***");
            return  false;
        }
    }
}
