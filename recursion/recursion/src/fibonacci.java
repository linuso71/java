public class fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        fib(a,b,0);
        System.out.println();
        System.out.println(fib(10));


    }
    static void fib(int a,int b,int n){
        if (n == 10){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        n+=1;
        fib(b,c,n);
    }

    // find the fib at particular n
    static int fib(int n){
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
