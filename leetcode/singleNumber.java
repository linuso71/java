package leetcode;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int j = 0;
        for (int i=1;i<nums.length;i++){
            if (nums[i] == nums[j]){
                j = j+1;
            } 
        }
        System.out.println(j);
    }
}
