package ch07;

class Coffe {
    void print1() {
        System.out.println("Jamaica");
    }
    static void print2(){
        System.out.println("Vietnam");
    }

    public static void main(String[] args) {
        Coffe ob = new Coffe();
        ob.print1();
        ob.print2();
        print2();
    }
}
