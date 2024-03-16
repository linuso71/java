import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        for (int i = 0;i<arr.length;i++){
            // take last element of array
            int last = arr.length - 1- i;
            // get max index
            int max=  0;
            for (int j=0;j<=last;j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max]=arr[last];
            arr[last] = temp;

        }
        System.out.println("Selection sort "+Arrays.toString(arr));
    }
}
