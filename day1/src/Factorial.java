import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num<0)
        {
            System.out.println("Invalid Input");
        }
        else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }


            System.out.println("factorial of " + num + " is: " + factorial);
        }
        sc.close();
    }
}
