import java.util.Scanner;

public class CheckPrime {
    public static void checkPrime(int n){
        if(n <= 1){
            System.out.println(n + " is not a prime number");
            return;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkPrime(n);
        sc.close();
    }
}
