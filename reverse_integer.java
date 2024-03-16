// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. 
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
public class reverse_integer {
    public static void main(String[] args) {
        int num = -123;
        int rem = 0;
        int new_num = 0;
        if ((num <= 2147483647) && (num >= -2147483648)){
            if (num > 0){
                int temp = num;
                while (temp>0){
                    
                rem = temp % 10;
                new_num =  new_num*10 + rem;
                temp = temp/10;
            }
            System.out.println(new_num);
        }
            else{
                int temp = -1*num;
                while (temp>0){
                    rem = temp % 10;
                    new_num =  new_num*10 + rem;
                    temp = temp/10;
                }
                System.out.println(-1*new_num);
            }

        }
        else{
            System.out.println(0);
        }
        
    }
}
