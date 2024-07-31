
import java.util.Arrays;

public class hashing {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1,2};
        hashing_int(arr);
        String str = "abcadabeafc";
        hashing_str(str);
        hashing_lowercase_str(str);

    }
    static void hashing_int(int[] arr){
        int[] hash = new int[13];
        for(int i=0;i<=arr.length-1;i++){
            hash[arr[i]] +=1; 
        }
        int num = 2;
        System.out.println(hash[num]);
    }
    static void hashing_str(String str){
        int[] hash = new int[256];
        for (int i=0;i<str.length()-1;i++){
            hash[str.charAt(i)]++;
        }
        String s = "a";
        System.out.println(hash[s.charAt(0)]);

    }
    static void hashing_lowercase_str(String str){
        int[] hash  = new int[26];
        for (int i=0;i<str.length();i++){
            hash[str.charAt(i) - 'a']++; // auto cascade to int value
        }
        System.out.println(Arrays.toString(hash));
    }
}
