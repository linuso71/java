import java.util.Arrays;

public class hashing {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,1,5,3};
        int_hashing(nums);
        char[] chars = {'a','d','a','c','d'};
        char_hashing(chars);
    }
    static void int_hashing(int[] nums){
        // while creating hashing size should be maximum from the list
        int[] hash = new int[6];
        for(int i = 0 ;i<nums.length;i++){
            hash[nums[i]]++;
        }
        System.out.println(Arrays.toString(hash));
    }
    static void char_hashing(char[] chars){
        int[] hash = new int[26];
        for (int i =0;i<chars.length;i++){
            hash[chars[i]-'a']++;
        }
        System.out.println(Arrays.toString(hash));
    }
}
