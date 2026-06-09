import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series: ");
        int n = sc.nextInt();

        int first=0;
        int second=1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
