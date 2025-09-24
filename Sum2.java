import java.util.Scanner;

public class Sum2 {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = sumOfDigits(n);
        System.out.println("The sum of digits is: " + ans);
        sc.close();
    }
}
