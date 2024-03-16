public class pattern {
    public static void main(String[] args) {
        pattern5();
    }
    static void pattern1(){
        int n=4;
        for (int i = 0;i<n;i++){
            for (int j= 0 ;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        int n=4;
        for (int i = 0;i<=n;i++){
            for (int j= 0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int n=5;
        for (int i = 1;i<=n;i++){
            for (int j= 1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern4(){
        int n=5;
        for (int i = 0;i<n;i++){
            for (int j=n-i;j>0;j--){
                System.out.print("*");
                // System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern5(){
        int n = 5;
        for (int i = 0; i<n;i++){
            for (int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k = 0;k<i;k++){
                System.out.print("*");
            }
            for (int l = 1;l<i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern6(){
        int n = 5;
        for (int i =0; i<n;i++){
            for (int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for (int k = n-i;k>0;k--){
                System.out.print("*");
            }
            for (int l = i+1;l<n;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern7(){
        pattern5();
        pattern6();
    }
}
