package generics;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i<5;i++){
            arr.add(i+1);

        }
        arr.forEach((item) -> System.out.println(item*2));

        Operation sum = (a,b) -> (a+b);
        Operation prod = (a,b) -> (a*b);
        Operation sub = (a,b) -> (a-b);

        LambdaFunction mycal = new LambdaFunction();
        System.out.println(mycal.operate(2,3,sum));
        System.out.println(mycal.operate(2,3,prod));
        System.out.println(mycal.operate(2,3,sub));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a,int b);
}
