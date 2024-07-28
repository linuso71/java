import java.util.Arrays;
// 2D binary search
public class MatrixBinarySearch{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 2))); 
    }
    static int[] binarysearch(int[][] arr,int row,int s,int e,int target){
        
        while(s<= e){
            int mid = s + (e - s) / 2;
            if (target < arr[row][mid]){
                e = mid -1;
            }
            else if (target > arr[row][mid]) {
                s = mid + 1;
            }
            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if (cols == 0 ){
            return new int[]{-1,-1};
        }
        if (rows == 0){
            return binarysearch(arr,0,0,cols-1,target);
        }
        // get only 2 rows
        int start = 0;
        int end = rows -1;
        int cmid = cols/2;
        
        while (start < (end -1)){
            int rmid = start + (end-start)/2;
            if (target < arr[rmid][cmid]){
                end = rmid; // eleminate rows below target 
            }
            else if (target > arr[rmid][cmid]) {
                start = rmid; // eleminate rows upper than target
            }
            else{
                return new int[]{rmid,cmid};
            }
        }
        if (target == arr[start][cmid]){
            return new int[]{start,cmid};
        }
        if (target == arr[start+1][cmid]){
            return new int[]{start+1,cmid};
        }

        if (target <= arr[start][cmid-1]){
            return binarysearch(arr, start, 0, cmid-1, target);
        }
        if (target >= arr[start][cmid+1] && target<=arr[start][cols-1]){
            return binarysearch(arr, start,cmid+1 , cols-1, target);
        }
        if (target <= arr[start+1][cmid-1]){
            return binarysearch(arr, start+1, 0, cmid-1, target);
        }
        else{
            return binarysearch(arr, start+1, cmid+1, cols-1, target);
        }
    }
}