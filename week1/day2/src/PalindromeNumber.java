import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num;
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if (original == reversed){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        input.close();
    }
}
