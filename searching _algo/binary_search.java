public class binary_search {
    public static void main(String[] args) {
        // sorted array
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(binary_search_algo(arr, target));
        
    }
    static int binary_search_algo(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (target> mid ){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
}
