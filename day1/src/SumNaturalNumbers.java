import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
        sc.close();

    }
}
