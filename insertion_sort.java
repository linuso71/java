import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {9,3,6,2,0};
        for (int i = 0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
