public class CountZeroes {
    public static void main(String[] args) {
        int num = 10203005;
        System.out.println(countZero(num,0));
    }
    static int countZero(int num,int count){
        if (num == 0){
            return count;
        }

        if (num%10 == 0){
            count +=1;
        }

        return countZero(num/10, count);
    }
}
