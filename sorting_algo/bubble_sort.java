import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length -i;j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
