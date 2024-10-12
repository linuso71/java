public class ReverseNum {
    static int sum = 0;


    static void rev(int num){
        int len = String.valueOf(num).length();
        if (num ==0){
            return ;
        }
        int rem = num%10;
        sum  =sum *10 +rem;
        rev(num/10);

    }

    static int rev1(int num){
        double len = String.valueOf(num).length();
        if (num ==0){
            return 0;
        }
        return num%10 * (int)Math.pow(10,(len-1)) + rev1(num/10);

    }
    public static void main(String[] args) {
        int num = 12346;
//        rev(num);
//        System.out.println(sum);
        System.out.println(rev1(num));
    }
}
