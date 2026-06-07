import java.util.Scanner;
public class RecursiveSumOfDigits {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of the digits of " + n + " is " + sumOfDigits(n));
        sc.close();
    }
}
