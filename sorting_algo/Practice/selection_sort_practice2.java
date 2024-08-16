import java.util.Arrays;

public class selection_sort_practice2 {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        for (int i=arr.length-1;i>=0;i--){
            int last = i;
            int max = 0;
            for (int j=0;j<last;j++){
                if (arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;

    }
    System.out.println(Arrays.toString(arr));

    }
}
