public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumDigi(12354));
    }
    static int sumDigi(int num){
        if (num ==0){
            return 0;
        }
        return num%10 + sumDigi((num)/10);

    }
}
