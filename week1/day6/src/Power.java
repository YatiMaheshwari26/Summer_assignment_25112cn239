import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (x): ");2
        int x = sc.nextInt();
        System.out.println("Enter exponent (n): ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        System.out.println(x+ "^" +n+ "="+result);
        sc.close();
    }
}
