import java.util.Scanner;

public class Dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dice: ");
        int n = sc.nextInt();

        int ans = 7-n;
        System.out.println("The answer is: " + ans);
        sc.close();
    }
}
