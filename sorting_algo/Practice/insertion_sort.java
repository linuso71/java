import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,1};
        System.out.println(Arrays.toString(insertion_sorting(arr)));
    }
    static int[] insertion_sorting(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        return arr;
    }
}
