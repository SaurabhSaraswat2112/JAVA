public class Sum1 {
    public static int sum(int n){
        if(n == 1){
            return 1;

        }else{
            int sum = 0;
            while(n >= 1){
                sum += n*n;
                n--;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
