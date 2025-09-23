import java.util.Scanner;
public class CheckEvenOdd {
    static void checkEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkEvenOdd(number);
        sc.close();

        
    }
}
