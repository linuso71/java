package array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9,18,5,18};
        int target = 18;
        System.out.println(Search(arr,target,0));
        SearchMul(arr,target,0);
        System.out.println(list);
    }
    static int Search(int[] arr,int target, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }

        return Search(arr,target,i+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void SearchMul(int[] arr, int target, int i){
        if (i == arr.length){
            return;
        }
        if (arr[i] == target){
            list.add(i);
        }
        SearchMul(arr,target,i+1);
    }
}
