package ch11;
class MyException1 extends Exception{
}
class MyException2 extends Exception{
}
class MyExceptionEx {
    public static void main(String[] args) {
        try {
            MyMethod(args[0]);
        }
        catch (MyException1 e1){
            System.out.println("예외 1");
        }
        catch (MyException2 e2){
            System.out.println("예외 2");
        }
        finally {
            System.out.println("끝");
        }
    }
    static void MyMethod(String str) throws MyException1, MyException2{
        System.out.print("입력값은 "+str+"입니다.");
        int x = Integer.parseInt(str);

        switch (x){
            case 1:
                throw new MyException1();
            case 2:
                throw new MyException2();
            default:
                System.out.println("예외 없음");
        }
    }
}