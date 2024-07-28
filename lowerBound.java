public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3 ,3,5};
        int n = arr.length;
        int x = 2;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if (arr[mid] >= x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        System.out.println(ans);
    }
}
