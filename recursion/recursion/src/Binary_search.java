public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 2;
        System.out.println(rec_searc(0,arr.length-1,arr,target));
    }
    static int rec_searc(int start ,int end,int[] arr,int target){
        if (start > end) {
            return -1; // Base case: Target not found
        }
        int mid = (start + end )/2;
        if (arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target){
            return rec_searc(start,mid-1,arr,target);
        }
        else{
            return rec_searc(mid+1,end,arr,target);
        }
    }
}
