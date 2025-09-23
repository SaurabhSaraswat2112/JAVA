// Sum of first n natural numbers using recursion

public class Sum {
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int num = 5;
        int res = sum(num);
        System.out.println("Sum of first "+num+" natural numbers is: "+res);
    }
    
}
