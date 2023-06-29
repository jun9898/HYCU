package ch07;

class Anyone{
    int add(int ...a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    void calc(){
        int s = add(1,2,3,4,5);
        System.out.println(s);
    }
}
public class MethodTest_07 {
    public static void main(String[] args) {
        Anyone b = new Anyone();
        System.out.println(b.add(1,2,3,4,5));
        b.calc();

//        b.add(1,2,3,4);
    }
}
