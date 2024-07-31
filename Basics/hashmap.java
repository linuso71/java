import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};
        hashmap_Integer(arr);
    }
    static void hashmap_Integer(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int key = arr[i];
            int freq = 1;
            if (mp.containsKey(key)){
                freq = mp.get(key);
                freq++;
            }
            mp.put(key, freq);
        }
        for (HashMap.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey()+" "+ it.getValue());
            
        }
    }
}
