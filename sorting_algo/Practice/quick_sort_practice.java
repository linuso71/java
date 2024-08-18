
import java.util.Arrays;



public class quick_sort_practice {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        int low = 0;
        int high = arr.length-1;
        quick_sort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr,int low,int high){
        if(low<high){
                int p = pivot(arr,low,high);
                quick_sort(arr, low, p-1);
                quick_sort(arr, p+1, high);
        }
        // System.out.println(Arrays.toString(arr));
    }
    static int pivot(int[] arr,int low ,int high){
        int p = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=p && i<=high-1){
                i++;
            }
            while(arr[j]>p && j>=low+1){
                j--;
            }
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;
        return j;
    }
}
