public class strings {
    public static void main(String[] args) {
        String a = null;
        boolean flag = true;
        int start = 0;
        int end = a.length()-1;
        while(start <= end){
            if (a.charAt(start) == a.charAt(end)){
                start++;
                end--;
            }
            else{
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("plaindrome");
        }
        else{
            System.out.println("not plaindrome");
        }
        
          

    
    }
}