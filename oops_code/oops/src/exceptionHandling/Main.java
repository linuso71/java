package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try{
            divide(a,b);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will run anyway");
        }

    }
    static int divide(int a,int b) throws ArithmeticException, MyException {
        if (b ==0){
            throw new MyException("");
        }
        return a/b;

    }
}
