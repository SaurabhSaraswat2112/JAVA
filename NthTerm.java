import java.util.Scanner;

public class NthTerm {
    public static int nthTerm(int a, int d, int n){
        return a+(n-1)*d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int ans = nthTerm(a, d, n);
        System.out.println("The "+n+"th term is : " + ans);
        sc.close();
    }
    
}
