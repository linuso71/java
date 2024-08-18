import java.util.Arrays;

public class bubble_sort_practice2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        for(int j =0;j<arr.length;j++){
            int last = arr.length - 1 -j;
            for (int i =1;i<=last;i++){
            if(arr[i-1] > arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
