import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int k = 2;
        while(k < n){
            arr[k] = arr[k-1] + arr[k-2];
            k++;
        }
        for(int i: arr){
            System.out.print(i+", ");
        }
        sc.close();
    }
}
