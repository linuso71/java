package array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
//        if (comparison(arr,0) == -1){
//            System.out.println("not sorted");
//        }
//        else{
//            System.out.println("sorted");
//        }

        if (comparison1(arr,0)){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }

    }
    static int comparison(int[] arr,int i){
        if (i == arr.length-1){
            return 1;
        }
        if (arr[i] > arr[i+1]){
            return -1;
        }
        return comparison(arr,i+1);
    }

    static Boolean comparison1(int[] arr,int i){
        if (i == arr.length-1){
            return true;
        }
        return arr[i]< arr[i+1] && comparison1(arr,i+1);
    }
}
