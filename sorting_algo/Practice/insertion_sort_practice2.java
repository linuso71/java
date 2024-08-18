import java.util.Arrays;

public class insertion_sort_practice2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        // for(int i=1;i<arr.length;i++){
        //     int j = i;
        //     while(j>0 && arr[j-1]>arr[j]){
        //         int temp = arr[j-1];
        //         arr[j-1] = arr[j];
        //         arr[j] = temp;
        //         j--; 
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        descending_order(arr);
    }
    static void descending_order(int[] arr){
        for (int i=arr.length-2;i>=0;i--){
            int j = i;
            while(j<arr.length-1 & arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
