package ch07;

class AA {
    int s, t, r;

    AA() {
        System.out.println("인수가 없는 생성자가 호출됨");
        System.out.printf("s = %d, t = %d, r = %d\n",s,t,r);
    }
    AA(int a, int b){
        s = a;
        t = b;

        System.out.println("인수가 있는 생성자가 호출됨");
        System.out.printf("s = %d, t = %d, r = %d\n",s,t,r);
    }
}

class ConstructorTest_3 {
     public static void main(String[] args) {

        AA oa1 = new AA();
        AA oa2 = new AA(3,4);

    }
}
