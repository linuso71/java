
import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort(int[] arr, int low, int high){
        if (low<high){ //checking for the element in array more than 1
            int p = pivot(arr,low,high);
            quick_sort(arr, low,p-1);
            quick_sort(arr, p+1, high);
        }
    }
    static int pivot(int[] arr, int low, int high){
        int p = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=p && i<=high -1){
                i++;
            }
            while(arr[j]>p && j>=low+1){
                j--;
            }
            if (i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
