import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println("Product of digits is: " + product );
        input.close();
    }
}
