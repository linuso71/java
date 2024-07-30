package Practice;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1};
        System.out.println(Arrays.toString(bubble_sorting(arr)));
    }
    static int[] bubble_sorting(int[] arr){
        for (int j = 0;j<arr.length -1;j++){
            for (int i=1;i<arr.length -j;i++){
                if (arr[i-1]> arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
