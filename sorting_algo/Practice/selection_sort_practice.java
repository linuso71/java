package Practice;

import java.util.Arrays;

public class selection_sort_practice {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(selection_sort(arr)));
    }
    static int[] selection_sort(int[] arr){
        for (int j=0;j<arr.length;j++){
        int max =0;
        int last = arr.length -1 -j;
        for (int i =0;i<=last;i++){
            if (arr[max]<arr[i]){
                max = i;
            }
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }
    return arr;
    }
}
