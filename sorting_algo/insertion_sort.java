import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {9,3,6,2,0};
        // for (int i = 0;i<arr.length-1;i++){
        //     for (int j=i+1;j>0;j--){
        //         if (arr[j]<arr[j-1]){
        //             //swap
        //             int temp = arr[j-1];
        //             arr[j-1] = arr[j];
        //             arr[j] = temp;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        int[] output = insertion(arr);
        System.out.println(Arrays.toString(output));
        }
    static int[] insertion(int[] arr){
        for (int i=0;i<arr.length;i++){
            int j = i;
            int temp = 0;
            while(j>0 && arr[j]<arr[j-1]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
